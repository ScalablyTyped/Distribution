package typings.tableify

import typings.std.Record
import typings.tableify.anon.FnCall
import typings.tableify.tableifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: T): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: js.UndefOr[scala.Nothing], parents: js.Array[_]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: js.Array[/* keyof T */ String]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: js.Array[/* keyof T */ String], parents: js.Array[_]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: `false`): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: `false`, parents: js.Array[_]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: js.UndefOr[scala.Nothing], parents: js.Array[_]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: js.Array[/* keyof T */ String]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: js.Array[/* keyof T */ String], parents: js.Array[_]): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: `false`): String = js.native
  @JSImport("tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: `false`, parents: js.Array[_]): String = js.native
  
  @JSImport("tableify", "defaults")
  @js.native
  def defaults(config: Config): FnCall = js.native
  
  @js.native
  trait Config extends StObject {
    
    var classPrefix: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      @scala.inline
      def setClasses(value: Boolean): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    }
  }
}
