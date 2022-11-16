package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type AsyncZippable = {[path: string] : three.three/examples/jsm/libs/fflate.module.min.AsyncZippable | three.three/examples/jsm/libs/fflate.module.min.AsyncZippableFile}
}}}
to avoid circular code involving: 
- three.three/examples/jsm/libs/fflate.module.min.AsyncZippable
*/
trait AsyncZippable
  extends StObject
     with /* path */ StringDictionary[AsyncZippable | AsyncZippableFile]
object AsyncZippable {
  
  inline def apply(): AsyncZippable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncZippable]
  }
}
