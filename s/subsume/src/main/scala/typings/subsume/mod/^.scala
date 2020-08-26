package typings.subsume.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class ^ () extends Subsume {
  def this(id: String) = this()
}

@JSImport("subsume", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Extract embedded data with a specific `id` out of `text`.
  	Useful when `text` comes from an external source.
  	*/
  def parse(string: String, id: String): ParseResult = js.native
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
  def parseAll(string: String): ParseResults = js.native
  def parseAll(string: String, idArray: js.Array[String]): ParseResults = js.native
}

