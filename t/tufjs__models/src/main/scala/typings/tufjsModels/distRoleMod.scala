package typings.tufjsModels

import typings.std.Generator
import typings.std.Record
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRoleMod {
  
  @JSImport("@tufjs/models/dist/role", "DelegatedRole")
  @js.native
  open class DelegatedRole protected () extends Role {
    def this(opts: DelegatedRoleOptions) = this()
    
    def equals(other: DelegatedRole): Boolean = js.native
    
    def isDelegatedPath(targetFilepath: String): Boolean = js.native
    
    val name: String = js.native
    
    val pathHashPrefixes: js.UndefOr[js.Array[String]] = js.native
    
    val paths: js.UndefOr[js.Array[String]] = js.native
    
    val terminating: Boolean = js.native
  }
  /* static members */
  object DelegatedRole {
    
    @JSImport("@tufjs/models/dist/role", "DelegatedRole")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): DelegatedRole = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[DelegatedRole]
  }
  
  @JSImport("@tufjs/models/dist/role", "Role")
  @js.native
  open class Role protected () extends StObject {
    def this(options: RoleOptions) = this()
    
    def equals(other: Role): Boolean = js.native
    
    val keyIDs: js.Array[String] = js.native
    
    val threshold: Double = js.native
    
    def toJSON(): JSONObject = js.native
    
    val unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.native
  }
  /* static members */
  object Role {
    
    @JSImport("@tufjs/models/dist/role", "Role")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Role]
  }
  
  @JSImport("@tufjs/models/dist/role", "SuccinctRoles")
  @js.native
  open class SuccinctRoles protected () extends Role {
    def this(opts: SuccinctRolesOption) = this()
    
    val bitLength: Double = js.native
    
    def equals(other: SuccinctRoles): Boolean = js.native
    
    /***
      * Calculates the name of the delegated role responsible for 'target_filepath'.
      *
      * The target at path ''target_filepath' is assigned to a bin by casting
      * the left-most 'bit_length' of bits of the file path hash digest to
      * int, using it as bin index between 0 and '2**bit_length - 1'.
      *
      * Args:
      *  target_filepath: URL path to a target file, relative to a base
      *  targets URL.
      */
    def getRoleForTarget(targetFilepath: String): String = js.native
    
    def getRoles(): Generator[String, Any, Any] = js.native
    
    /***
      * Determines whether the given ``role_name`` is in one of
      * the delegated roles that ``SuccinctRoles`` represents.
      *
      * Args:
      *  role_name: The name of the role to check against.
      */
    def isDelegatedRole(roleName: String): Boolean = js.native
    
    val namePrefix: String = js.native
    
    val numberOfBins: Double = js.native
    
    val suffixLen: Double = js.native
  }
  /* static members */
  object SuccinctRoles {
    
    @JSImport("@tufjs/models/dist/role", "SuccinctRoles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): SuccinctRoles = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[SuccinctRoles]
  }
  
  @JSImport("@tufjs/models/dist/role", "TOP_LEVEL_ROLE_NAMES")
  @js.native
  val TOP_LEVEL_ROLE_NAMES: js.Array[String] = js.native
  
  trait DelegatedRoleOptions
    extends StObject
       with RoleOptions {
    
    var name: String
    
    var pathHashPrefixes: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    var terminating: Boolean
  }
  object DelegatedRoleOptions {
    
    inline def apply(keyIDs: js.Array[String], name: String, terminating: Boolean, threshold: Double): DelegatedRoleOptions = {
      val __obj = js.Dynamic.literal(keyIDs = keyIDs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], terminating = terminating.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegatedRoleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelegatedRoleOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPathHashPrefixes(value: js.Array[String]): Self = StObject.set(x, "pathHashPrefixes", value.asInstanceOf[js.Any])
      
      inline def setPathHashPrefixesUndefined: Self = StObject.set(x, "pathHashPrefixes", js.undefined)
      
      inline def setPathHashPrefixesVarargs(value: String*): Self = StObject.set(x, "pathHashPrefixes", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setTerminating(value: Boolean): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoleOptions extends StObject {
    
    var keyIDs: js.Array[String]
    
    var threshold: Double
    
    var unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.undefined
  }
  object RoleOptions {
    
    inline def apply(keyIDs: js.Array[String], threshold: Double): RoleOptions = {
      val __obj = js.Dynamic.literal(keyIDs = keyIDs.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoleOptions] (val x: Self) extends AnyVal {
      
      inline def setKeyIDs(value: js.Array[String]): Self = StObject.set(x, "keyIDs", value.asInstanceOf[js.Any])
      
      inline def setKeyIDsVarargs(value: String*): Self = StObject.set(x, "keyIDs", js.Array(value*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFields(value: Record[String, JSONValue]): Self = StObject.set(x, "unrecognizedFields", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFieldsUndefined: Self = StObject.set(x, "unrecognizedFields", js.undefined)
    }
  }
  
  trait SuccinctRolesOption
    extends StObject
       with RoleOptions {
    
    var bitLength: Double
    
    var namePrefix: String
  }
  object SuccinctRolesOption {
    
    inline def apply(bitLength: Double, keyIDs: js.Array[String], namePrefix: String, threshold: Double): SuccinctRolesOption = {
      val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], keyIDs = keyIDs.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccinctRolesOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccinctRolesOption] (val x: Self) extends AnyVal {
      
      inline def setBitLength(value: Double): Self = StObject.set(x, "bitLength", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    }
  }
}
