package typings.subsume

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subsume", JSImport.Default)
  @js.native
  /**
  	Embed data in other data and easily extract it when needed.
  	@param id - You probably don't need to set this. Can be useful if you need a stable ID.
  	@example
  	```
  	import Subsume from 'subsume';
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
  open class default ()
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
    override val id: String = js.native
    
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
    override val postfix: String = js.native
    
    /**
    	Prefix used in `.compose()`.
    	*/
    /* CompleteClass */
    override val prefix: String = js.native
    
    /**
    	Regex used in `.parse()`.
    	*/
    /* CompleteClass */
    override val regex: js.RegExp = js.native
  }
  /* static members */
  object default {
    
    @JSImport("subsume", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Extract embedded data with a specific `id` out of `text`.
    	Useful when `text` comes from an external source.
    	*/
    inline def parse(string: String, id: String): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
    
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
    inline def parseAll(string: String): ParseResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(string.asInstanceOf[js.Any]).asInstanceOf[ParseResults]
    inline def parseAll(string: String, idArray: js.Array[String]): ParseResults = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(string.asInstanceOf[js.Any], idArray.asInstanceOf[js.Any])).asInstanceOf[ParseResults]
  }
  
  trait ParseResult extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var rest: String
  }
  object ParseResult {
    
    inline def apply(rest: String): ParseResult = {
      val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseResults extends StObject {
    
    var data: Map[String, String]
    
    var rest: String
  }
  object ParseResults {
    
    inline def apply(data: Map[String, String], rest: String): ParseResults = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResults] (val x: Self) extends AnyVal {
      
      inline def setData(value: Map[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
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
    val id: String
    
    /**
    	Extract your embedded data from `text`.
    	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
    	*/
    def parse(string: String): ParseResult
    
    /**
    	Postfix used in `.compose()`.
    	*/
    val postfix: String
    
    /**
    	Prefix used in `.compose()`.
    	*/
    val prefix: String
    
    /**
    	Regex used in `.parse()`.
    	*/
    val regex: js.RegExp
  }
  object Subsume {
    
    inline def apply(
      compose: String => String,
      id: String,
      parse: String => ParseResult,
      postfix: String,
      prefix: String,
      regex: js.RegExp
    ): Subsume = {
      val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), id = id.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), postfix = postfix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subsume]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subsume] (val x: Self) extends AnyVal {
      
      inline def setCompose(value: String => String): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParse(value: String => ParseResult): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
}
