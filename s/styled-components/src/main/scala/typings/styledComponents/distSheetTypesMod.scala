package typings.styledComponents

import typings.std.HTMLElement
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSheetTypesMod {
  
  @js.native
  trait GroupedTag extends StObject {
    
    def clearGroup(group: Double): Unit = js.native
    
    def getGroup(group: Double): String = js.native
    
    var groupSizes: js.typedarray.Uint32Array = js.native
    
    def insertRules(group: Double, rules: String): Unit = js.native
    def insertRules(group: Double, rules: js.Array[String]): Unit = js.native
    
    var length: Double = js.native
    
    var tag: Tag = js.native
  }
  
  @js.native
  trait Sheet extends StObject {
    
    def allocateGSInstance(id: String): Double = js.native
    
    def clearNames(id: String): Unit = js.native
    
    def clearRules(id: String): Unit = js.native
    
    def clearTag(): Unit = js.native
    
    def getTag(): GroupedTag = js.native
    
    def hasNameForId(id: String, name: String): Boolean = js.native
    
    def insertRules(id: String, name: String, rules: String): Unit = js.native
    def insertRules(id: String, name: String, rules: js.Array[String]): Unit = js.native
    
    var names: Map[String, Set[String]] = js.native
    
    var options: SheetOptions = js.native
    
    def registerName(id: String, name: String): Unit = js.native
  }
  
  trait SheetOptions extends StObject {
    
    var isServer: Boolean
    
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    var useCSSOMInjection: Boolean
  }
  object SheetOptions {
    
    inline def apply(isServer: Boolean, useCSSOMInjection: Boolean): SheetOptions = {
      val __obj = js.Dynamic.literal(isServer = isServer.asInstanceOf[js.Any], useCSSOMInjection = useCSSOMInjection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetOptions]
    }
    
    extension [Self <: SheetOptions](x: Self) {
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUseCSSOMInjection(value: Boolean): Self = StObject.set(x, "useCSSOMInjection", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    def deleteRule(index: Double): Unit
    
    def getRule(index: Double): String
    
    def insertRule(index: Double, rule: String): Boolean
    
    var length: Double
  }
  object Tag {
    
    inline def apply(
      deleteRule: Double => Unit,
      getRule: Double => String,
      insertRule: (Double, String) => Boolean,
      length: Double
    ): Tag = {
      val __obj = js.Dynamic.literal(deleteRule = js.Any.fromFunction1(deleteRule), getRule = js.Any.fromFunction1(getRule), insertRule = js.Any.fromFunction2(insertRule), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setDeleteRule(value: Double => Unit): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1(value))
      
      inline def setGetRule(value: Double => String): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
      
      inline def setInsertRule(value: (Double, String) => Boolean): Self = StObject.set(x, "insertRule", js.Any.fromFunction2(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
