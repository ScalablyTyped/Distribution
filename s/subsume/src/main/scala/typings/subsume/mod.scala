package typings.subsume

import typings.std.Map
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subsume", JSImport.Namespace)
  @js.native
  /**
  	Embed data in other data and easily extract it when needed.
  	@param id - You probably don't need to set this. Can be useful if you need a stable ID.
  	@example
  	```
  	import Subsume = require('subsume');
  	const subsume = new Subsume();
  	console.log(subsume.id);
  	//=> '7febcd0b3806fbc48c01d7cea4ed1219'
  	const text = subsume.compose('🦄');
  	//=> '@@[7febcd0b3806fbc48c01d7cea4ed1219]@@🦄##[7febcd0b3806fbc48c01d7cea4ed1219]##'
  	// The text can now be embedded in some other text
  	const output = `some${text} random text`;
  	//=> 'some@@[7febcd0b3806fbc48c01d7cea4ed1219]@@🦄##[7febcd0b3806fbc48c01d7cea4ed1219]## random text'
  	// At a later point we extract it
  	subsume.parse(output);
  	//=> {data: '🦄', rest: 'some random text'}
  	// Or in a different process by using the `id`
  	const input = 'some@@[7febcd0b3806fbc48c01d7cea4ed1219]@@🦄##[7febcd0b3806fbc48c01d7cea4ed1219]## random text';
  	Subsume.parse(text, '7febcd0b3806fbc48c01d7cea4ed1219');
  	//=> {data: '🦄', rest: 'some random text'}
  	```
  	*/
  class ^ ()
    extends StObject
       with Subsume {
    def this(id: String) = this()
    
    /**
    	@returns A wrapped version of `text` that you can embed in other content.
    	*/
    /* CompleteClass */
    override def compose(string: String): String = js.native
    
    /**
    	Used identifier.
    	*/
    /* CompleteClass */
    var id: String = js.native
    
    /**
    	Extract your embedded data from `text`.
    	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
    	*/
    /* CompleteClass */
    override def parse(string: String): ParseResult = js.native
    
    /**
    	Postfix used in `.compose()`.
    	*/
    /* CompleteClass */
    var postfix: String = js.native
    
    /**
    	Prefix used in `.compose()`.
    	*/
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
    	Regex used in `.parse()`.
    	*/
    /* CompleteClass */
    var regex: RegExp = js.native
  }
  @JSImport("subsume", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Extract embedded data with a specific `id` out of `text`.
  	Useful when `text` comes from an external source.
  	*/
  /* static member */
  @scala.inline
  def parse(string: String, id: String): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  
  /**
  	Extract embedded data corresponding to all IDs in `idArray`, if specified. Otherwise it will extract embedded data for all top-level IDs.
  	@returns An object with a Map with an entry for each parsed ID, and a rest string for what remains after all the required IDs have been parsed, as seen below:
  	The input:
  	```
  	some@@[7febcd0b3806fbc48c01d7cea4ed1219]@@🦄##[7febcd0b3806fbc48c01d7cea4ed1219]## random@@[7febcd0b3806fbc48c01d7cea4ed1218]@@🦄##[7febcd0b3806fbc48c01d7cea4ed1218]## text@@[7febcd0b3806fbc48c01d7cea4ed1217]@@🦄##[7febcd0b3806fbc48c01d7cea4ed1217]##
  	```
  	Gives the following output:
  	```
  	{
  		data: Map {
  			'7febcd0b3806fbc48c01d7cea4ed1219' => '🦄',
  			'7febcd0b3806fbc48c01d7cea4ed1218' => '🦄',
  			'7febcd0b3806fbc48c01d7cea4ed1217' => '🦄'
  		},
  		rest: 'some random text'
  	}
  	```
  	*/
  /* static member */
  @scala.inline
  def parseAll(string: String): ParseResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(string.asInstanceOf[js.Any]).asInstanceOf[ParseResults]
  @scala.inline
  def parseAll(string: String, idArray: js.Array[String]): ParseResults = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(string.asInstanceOf[js.Any], idArray.asInstanceOf[js.Any])).asInstanceOf[ParseResults]
  
  trait ParseResult extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var rest: String
  }
  object ParseResult {
    
    @scala.inline
    def apply(rest: String): ParseResult = {
      val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit class ParseResultMutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseResults extends StObject {
    
    var data: Map[String, String]
    
    var rest: String
  }
  object ParseResults {
    
    @scala.inline
    def apply(data: Map[String, String], rest: String): ParseResults = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResults]
    }
    
    @scala.inline
    implicit class ParseResultsMutableBuilder[Self <: ParseResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Map[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subsume extends StObject {
    
    /**
    	@returns A wrapped version of `text` that you can embed in other content.
    	*/
    def compose(string: String): String
    
    /**
    	Used identifier.
    	*/
    var id: String
    
    /**
    	Extract your embedded data from `text`.
    	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
    	*/
    def parse(string: String): ParseResult
    
    /**
    	Postfix used in `.compose()`.
    	*/
    var postfix: String
    
    /**
    	Prefix used in `.compose()`.
    	*/
    var prefix: String
    
    /**
    	Regex used in `.parse()`.
    	*/
    var regex: RegExp
  }
  object Subsume {
    
    @scala.inline
    def apply(
      compose: String => String,
      id: String,
      parse: String => ParseResult,
      postfix: String,
      prefix: String,
      regex: RegExp
    ): Subsume = {
      val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), id = id.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), postfix = postfix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subsume]
    }
    
    @scala.inline
    implicit class SubsumeMutableBuilder[Self <: Subsume] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompose(value: String => String): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: String => ParseResult): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
}
