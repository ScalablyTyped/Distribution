package typings.usage

import typings.std.Error
import typings.usage.anon.Rss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("usage", "clearHistory")
  @js.native
  def clearHistory(): Unit = js.native
  @JSImport("usage", "clearHistory")
  @js.native
  def clearHistory(pid: Double): Unit = js.native
  
  @JSImport("usage", "lookup")
  @js.native
  def lookup(pid: Double, callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]): Unit = js.native
  @JSImport("usage", "lookup")
  @js.native
  def lookup(
    pid: Double,
    options: Options,
    callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]
  ): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var keepHistory: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(keepHistory: Boolean): Options = {
      val __obj = js.Dynamic.literal(keepHistory = keepHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepHistory(value: Boolean): Self = StObject.set(x, "keepHistory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResultObject extends StObject {
    
    var cpu: Double = js.native
    
    var memory: Double = js.native
    
    var memoryInfo: Rss = js.native
  }
  object ResultObject {
    
    @scala.inline
    def apply(cpu: Double, memory: Double, memoryInfo: Rss): ResultObject = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryInfo = memoryInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultObject]
    }
    
    @scala.inline
    implicit class ResultObjectMutableBuilder[Self <: ResultObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryInfo(value: Rss): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    }
  }
}
