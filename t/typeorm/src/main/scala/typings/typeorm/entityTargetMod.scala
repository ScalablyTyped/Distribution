package typings.typeorm

import typings.typeorm.objectTypeMod.ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/common/EntityTarget", JSImport.Namespace)
@js.native
object entityTargetMod extends js.Object {
  
  trait _EntityTarget[Entity] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.objectTypeMod.ObjectType[Entity]
    - typings.typeorm.browserMod.EntitySchema[Entity]
    - java.lang.String
    - typings.typeorm.anon.Name[Entity]
  */
  type EntityTarget[Entity] = _EntityTarget[Entity] | ObjectType[Entity] | String
}
