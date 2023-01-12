package typings.tableify

import typings.std.Record
import typings.tableify.anon.FnCall
import typings.tableify.tableifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: T, columns: js.Array[/* keyof T */ String]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: T, columns: js.Array[/* keyof T */ String], parents: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: T, columns: Unit, parents: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: T, columns: `false`): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: T, columns: `false`, parents: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: js.Array[T], columns: js.Array[/* keyof T */ String]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: js.Array[T], columns: js.Array[/* keyof T */ String], parents: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: js.Array[T], columns: Unit, parents: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: js.Array[T], columns: `false`): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[T /* <: Record[String, Any] */](obj: js.Array[T], columns: `false`, parents: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(config: Config): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(config.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  trait Config extends StObject {
    
    var classPrefix: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      inline def setClasses(value: Boolean): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    }
  }
}
