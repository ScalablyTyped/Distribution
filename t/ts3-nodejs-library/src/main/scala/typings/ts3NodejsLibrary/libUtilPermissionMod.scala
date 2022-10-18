package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.anon.PartialPermType
import typings.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak
import typings.ts3NodejsLibrary.libUtilPermissionMod.Permission.IConfig
import typings.ts3NodejsLibrary.libUtilPermissionMod.Permission.PermId
import typings.ts3NodejsLibrary.libUtilPermissionMod.Permission.PermSid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPermissionMod {
  
  @JSImport("ts3-nodejs-library/lib/util/Permission", "Permission")
  @js.native
  open class Permission[T /* <: js.Object */] protected () extends StObject {
    def this(config: IConfig[T]) = this()
    
    /* private */ var _negate: Any = js.native
    
    /* private */ var _perm: Any = js.native
    
    /* private */ var _skip: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /* private */ var cmdRemove: Any = js.native
    
    /* private */ var cmdUpdate: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /** retrieves the permission object */
    def get(): PermId | PermSid = js.native
    
    /** retrieves a raw object with permid */
    /* private */ var getAsPermId: Any = js.native
    
    /** retrieves a raw object with permsid */
    /* private */ var getAsPermSid: Any = js.native
    
    /** retrieves skip and negate flags */
    /* private */ var getFlags: Any = js.native
    
    /** retrieves wether negate has been set */
    def getNegate(): Boolean = js.native
    
    /** retrieves the current permission */
    def getPerm(): js.UndefOr[String | Double] = js.native
    
    /** retrieves the correct permission name */
    /* private */ var getPermName: Any = js.native
    
    /** retrieves wether skip has been set */
    def getSkip(): Boolean = js.native
    
    /** retrieves the permission value */
    def getValue(): Double = js.native
    
    /** sets/gets the negate value */
    def negate(negate: Boolean): Permission[T] = js.native
    
    /** sets/gets the permid or permsid */
    def perm(perm: String): Permission[T] = js.native
    def perm(perm: Double): Permission[T] = js.native
    
    /** removes the specified permission */
    def remove(): js.Promise[js.Array[Any]] = js.native
    
    /** sets/gets the skip value */
    def skip(skip: Boolean): Permission[T] = js.native
    
    /* private */ var teamspeak: Any = js.native
    
    /** updates or adds the permission to the teamspeak server */
    def update(): js.Promise[js.Array[Any]] = js.native
    
    /** sets/gets the value for the permission */
    def value(value: Double): Permission[T] = js.native
    
    /* private */ var withSkipNegate: Any = js.native
  }
  /* static members */
  object Permission {
    
    @JSImport("ts3-nodejs-library/lib/util/Permission", "Permission")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaults(perm: PartialPermType): PartialPermType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")(perm.asInstanceOf[js.Any]).asInstanceOf[PartialPermType]
    
    trait BasePermission extends StObject {
      
      var negate: js.UndefOr[Boolean] = js.undefined
      
      var permvalue: Double
      
      var skip: js.UndefOr[Boolean] = js.undefined
    }
    object BasePermission {
      
      inline def apply(permvalue: Double): BasePermission = {
        val __obj = js.Dynamic.literal(permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[BasePermission]
      }
      
      extension [Self <: BasePermission](x: Self) {
        
        inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
        
        inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
        
        inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
        
        inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      }
    }
    
    trait IConfig[T] extends StObject {
      
      var allowSkipNegate: js.UndefOr[Boolean] = js.undefined
      
      var context: T
      
      var remove: String
      
      var teamspeak: TeamSpeak
      
      var update: String
    }
    object IConfig {
      
      inline def apply[T](context: T, remove: String, teamspeak: TeamSpeak, update: String): IConfig[T] = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], teamspeak = teamspeak.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfig[T]]
      }
      
      extension [Self <: IConfig[?], T](x: Self & IConfig[T]) {
        
        inline def setAllowSkipNegate(value: Boolean): Self = StObject.set(x, "allowSkipNegate", value.asInstanceOf[js.Any])
        
        inline def setAllowSkipNegateUndefined: Self = StObject.set(x, "allowSkipNegate", js.undefined)
        
        inline def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
        
        inline def setTeamspeak(value: TeamSpeak): Self = StObject.set(x, "teamspeak", value.asInstanceOf[js.Any])
        
        inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermId
      extends StObject
         with BasePermission {
      
      var permid: Double
    }
    object PermId {
      
      inline def apply(permid: Double, permvalue: Double): PermId = {
        val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermId]
      }
      
      extension [Self <: PermId](x: Self) {
        
        inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermSid
      extends StObject
         with BasePermission {
      
      var permsid: String
    }
    object PermSid {
      
      inline def apply(permsid: String, permvalue: Double): PermSid = {
        val __obj = js.Dynamic.literal(permsid = permsid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermSid]
      }
      
      extension [Self <: PermSid](x: Self) {
        
        inline def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermType extends StObject {
      
      var permname: String | Double
      
      var permnegated: js.UndefOr[Boolean] = js.undefined
      
      var permskip: js.UndefOr[Boolean] = js.undefined
      
      var permvalue: Double
    }
    object PermType {
      
      inline def apply(permname: String | Double, permvalue: Double): PermType = {
        val __obj = js.Dynamic.literal(permname = permname.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermType]
      }
      
      extension [Self <: PermType](x: Self) {
        
        inline def setPermname(value: String | Double): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
        
        inline def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
        
        inline def setPermnegatedUndefined: Self = StObject.set(x, "permnegated", js.undefined)
        
        inline def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
        
        inline def setPermskipUndefined: Self = StObject.set(x, "permskip", js.undefined)
        
        inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
      }
    }
  }
}
