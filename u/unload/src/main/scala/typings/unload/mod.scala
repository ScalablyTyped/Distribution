package typings.unload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("unload", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("unload", "default.add")
    @js.native
    def add: js.Any = js.native
    @scala.inline
    def add_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
    
    @JSImport("unload", "default.getSize")
    @js.native
    def getSize: js.Any = js.native
    @scala.inline
    def getSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSize")(x.asInstanceOf[js.Any])
    
    @JSImport("unload", "default.removeAll")
    @js.native
    def removeAll: js.Any = js.native
    @scala.inline
    def removeAll_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(x.asInstanceOf[js.Any])
    
    @JSImport("unload", "default.runAll")
    @js.native
    def runAll: js.Any = js.native
    @scala.inline
    def runAll_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runAll")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def add(fn: js.Function0[Unit]): addReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(fn.asInstanceOf[js.Any]).asInstanceOf[addReturn]
  
  @scala.inline
  def getSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Double]
  
  @scala.inline
  def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  
  @scala.inline
  def runAll(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAll")().asInstanceOf[js.Promise[js.Any]]
  
  trait addReturn extends StObject {
    
    def remove(): Unit
    
    def run(): js.Any
  }
  object addReturn {
    
    @scala.inline
    def apply(remove: () => Unit, run: () => js.Any): addReturn = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[addReturn]
    }
    
    @scala.inline
    implicit class addReturnMutableBuilder[Self <: addReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRun(value: () => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
}
