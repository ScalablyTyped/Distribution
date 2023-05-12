package typings.tufjsModels

import typings.std.Record
import typings.tufjsModels.distBaseMod.Signed
import typings.tufjsModels.distBaseMod.SignedOptions
import typings.tufjsModels.distKeyMod.Key
import typings.tufjsModels.distMetadataMod.MetadataType
import typings.tufjsModels.distRoleMod.Role
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRootMod {
  
  @JSImport("@tufjs/models/dist/root", "Root")
  @js.native
  open class Root protected ()
    extends Signed
       with MetadataType {
    def this(options: RootOptions) = this()
    
    def addKey(key: Key, role: String): Unit = js.native
    
    val consistentSnapshot: Boolean = js.native
    
    def equals(other: Root): Boolean = js.native
    
    val keys: KeyMap = js.native
    
    val roles: RoleMap = js.native
    
    val `type`: String | Double = js.native
  }
  /* static members */
  object Root {
    
    @JSImport("@tufjs/models/dist/root", "Root")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Root]
  }
  
  type KeyMap = Record[String, Key]
  
  type RoleMap = Record[String, Role]
  
  trait RootOptions
    extends StObject
       with SignedOptions {
    
    var consistentSnapshot: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[Record[String, Key]] = js.undefined
    
    var roles: js.UndefOr[Record[String, Role]] = js.undefined
  }
  object RootOptions {
    
    inline def apply(): RootOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootOptions] (val x: Self) extends AnyVal {
      
      inline def setConsistentSnapshot(value: Boolean): Self = StObject.set(x, "consistentSnapshot", value.asInstanceOf[js.Any])
      
      inline def setConsistentSnapshotUndefined: Self = StObject.set(x, "consistentSnapshot", js.undefined)
      
      inline def setKeys(value: Record[String, Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setRoles(value: Record[String, Role]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    }
  }
}
