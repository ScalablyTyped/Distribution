package typings.synchronousAutocomplete

import typings.node.bufferMod.global.Buffer
import typings.synchronousAutocomplete.buildMod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeMod {
  
  /**
    * Deserializes an index from a [protocol buffer](https://developers.google.com/protocol-buffers/) (a.k.a. *protobuf*).
    * May be used to deserialize a previously precomputed and serialized index back to JS objects.
    *
    * @example
    * import decode = require('synchronous-autocomplete/decode');
    * import createAutocomplete = require('synchronous-autocomplete');
    * import * as fs from 'fs';
    *
    * // read & decode the index
    * const encoded = fs.readFileSync('index.pbf');
    * const { tokens, scores, weights, nrOfTokens, originalIds } = decode(encoded);
    * // create autocomplete
    * const autocomplete = createAutocomplete(tokens, scores, weights, nrOfTokens, originalIds, str => str.split(/\s+/g));
    */
  inline def apply(buffer: Buffer): Index[String] = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Index[String]]
  
  @JSImport("synchronous-autocomplete/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
