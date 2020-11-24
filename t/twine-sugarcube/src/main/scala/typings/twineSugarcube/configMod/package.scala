package typings.twineSugarcube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configMod {
  
  type DescriptionHandler = js.ThisFunction0[
    /* this */ typings.twineSugarcube.passageMod.Passage, 
    java.lang.String | scala.Null
  ]
  
  type SaveObjectHander = js.Function2[
    /* save */ typings.twineSugarcube.saveMod.SaveObject, 
    /* details */ typings.twineSugarcube.configMod.SaveDetails, 
    scala.Unit
  ]
}
