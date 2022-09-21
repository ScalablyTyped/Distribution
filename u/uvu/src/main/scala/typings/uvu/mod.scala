package typings.uvu

import typings.std.Record
import typings.uvu.mod.uvu.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uvu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")().asInstanceOf[js.Promise[Unit]]
  inline def exec(bail: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(bail.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def suite[T](): Test[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suite")().asInstanceOf[Test[T]]
  inline def suite[T](title: String): Test[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suite")(title.asInstanceOf[js.Any]).asInstanceOf[Test[T]]
  inline def suite[T](title: String, context: T): Test[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("suite")(title.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Test[T]]
  inline def suite[T](title: Unit, context: T): Test[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("suite")(title.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Test[T]]
  
  @JSImport("uvu", "test")
  @js.native
  val test: Test[Context] = js.native
  
  type Callback[T] = typings.uvu.mod.uvu.Callback[T]
  
  type Context = Record[String, Any]
  
  type Test_[T] = Test[T]
  
  object uvu {
    
    type Callback[T] = js.Function1[/* context */ T & Crumbs, js.Promise[Unit] | Unit]
    
    trait Crumbs extends StObject {
      
      var __suite__ : String
      
      var __test__ : String
    }
    object Crumbs {
      
      inline def apply(__suite__ : String, __test__ : String): Crumbs = {
        val __obj = js.Dynamic.literal(__suite__ = __suite__.asInstanceOf[js.Any], __test__ = __test__.asInstanceOf[js.Any])
        __obj.asInstanceOf[Crumbs]
      }
      
      extension [Self <: Crumbs](x: Self) {
        
        inline def set__suite__(value: String): Self = StObject.set(x, "__suite__", value.asInstanceOf[js.Any])
        
        inline def set__test__(value: String): Self = StObject.set(x, "__test__", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Hook[T] extends StObject {
      
      def apply(hook: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
      
      def each(hook: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
    }
    
    @js.native
    trait Test[T] extends StObject {
      
      def apply(name: String, test: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
      
      def after(hook: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
      @JSName("after")
      var after_Original: Hook[T] = js.native
      
      def before(hook: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
      @JSName("before")
      var before_Original: Hook[T] = js.native
      
      def only(name: String, test: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
      
      def run(): Unit = js.native
      
      def skip(): Unit = js.native
      def skip(name: String): Unit = js.native
      def skip(name: String, test: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
      def skip(name: Unit, test: typings.uvu.mod.uvu.Callback[T]): Unit = js.native
    }
  }
}
