package typings.tufjsModels

import typings.std.Generator
import typings.std.Record
import typings.tufjsModels.anon.Role
import typings.tufjsModels.distKeyMod.Key
import typings.tufjsModels.distRoleMod.DelegatedRole
import typings.tufjsModels.distRoleMod.SuccinctRoles
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelegationsMod {
  
  @JSImport("@tufjs/models/dist/delegations", "Delegations")
  @js.native
  open class Delegations protected () extends StObject {
    def this(options: DelegationsOptions) = this()
    
    def equals(other: Delegations): Boolean = js.native
    
    val keys: KeyMap = js.native
    
    val roles: js.UndefOr[DelegatedRoleMap] = js.native
    
    def rolesForTarget(targetPath: String): Generator[Role, Any, Any] = js.native
    
    val succinctRoles: js.UndefOr[SuccinctRoles] = js.native
    
    def toJSON(): JSONObject = js.native
    
    val unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.native
  }
  /* static members */
  object Delegations {
    
    @JSImport("@tufjs/models/dist/delegations", "Delegations")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Delegations = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Delegations]
  }
  
  type DelegatedRoleMap = Record[String, DelegatedRole]
  
  trait DelegationsOptions extends StObject {
    
    var keys: KeyMap
    
    var roles: js.UndefOr[DelegatedRoleMap] = js.undefined
    
    var succinctRoles: js.UndefOr[SuccinctRoles] = js.undefined
    
    var unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.undefined
  }
  object DelegationsOptions {
    
    inline def apply(keys: KeyMap): DelegationsOptions = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegationsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelegationsOptions] (val x: Self) extends AnyVal {
      
      inline def setKeys(value: KeyMap): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: DelegatedRoleMap): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      inline def setSuccinctRoles(value: SuccinctRoles): Self = StObject.set(x, "succinctRoles", value.asInstanceOf[js.Any])
      
      inline def setSuccinctRolesUndefined: Self = StObject.set(x, "succinctRoles", js.undefined)
      
      inline def setUnrecognizedFields(value: Record[String, JSONValue]): Self = StObject.set(x, "unrecognizedFields", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFieldsUndefined: Self = StObject.set(x, "unrecognizedFields", js.undefined)
    }
  }
  
  type KeyMap = Record[String, Key]
}
