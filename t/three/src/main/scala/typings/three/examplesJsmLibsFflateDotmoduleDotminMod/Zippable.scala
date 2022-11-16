package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Zippable = {[path: string] : three.three/examples/jsm/libs/fflate.module.min.Zippable | three.three/examples/jsm/libs/fflate.module.min.ZippableFile}
}}}
to avoid circular code involving: 
- three.three/examples/jsm/libs/fflate.module.min.Zippable
*/
trait Zippable
  extends StObject
     with /* path */ StringDictionary[Zippable | ZippableFile]
object Zippable {
  
  inline def apply(): Zippable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zippable]
  }
}
