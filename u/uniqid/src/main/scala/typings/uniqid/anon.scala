package typings.uniqid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Process extends StObject {
    
    def process(): String
    def process(prefix: String): String
    def process(prefix: String, suffix: String): String
    def process(prefix: Unit, suffix: String): String
    @JSName("process")
    var process_Original: js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String]
    
    def time(): String
    def time(prefix: String): String
    def time(prefix: String, suffix: String): String
    def time(prefix: Unit, suffix: String): String
    @JSName("time")
    var time_Original: js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String]
  }
  object Process {
    
    inline def apply(
      process: (/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => String,
      time: (/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => String
    ): Process = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process), time = js.Any.fromFunction2(time))
      __obj.asInstanceOf[Process]
    }
    
    extension [Self <: Process](x: Self) {
      
      inline def setProcess(value: (/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => String): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      inline def setTime(value: (/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => String): Self = StObject.set(x, "time", js.Any.fromFunction2(value))
    }
  }
}
