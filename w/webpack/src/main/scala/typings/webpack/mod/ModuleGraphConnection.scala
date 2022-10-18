package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleGraphConnection extends StObject {
  
  var active: Unit
  
  def addCondition(condition: js.Function2[/* arg0 */ this.type, /* arg1 */ RuntimeSpec, ConnectionState]): Unit
  
  def addExplanation(explanation: String): Unit
  
  def condition(arg0: ModuleGraphConnection, arg1: RuntimeSpec): ConnectionState
  
  var conditional: Boolean
  
  var dependency: Null | Dependency
  
  val explanation: String
  
  var explanations: Set[String]
  
  def getActiveState(runtime: RuntimeSpec): ConnectionState
  
  def isActive(runtime: RuntimeSpec): Boolean
  
  def isTargetActive(runtime: RuntimeSpec): Boolean
  
  var module: Module
  
  var originModule: Null | Module
  
  var resolvedModule: Module
  
  var resolvedOriginModule: Null | Module
  
  def setActive(value: Boolean): Unit
  
  var weak: Boolean
}
object ModuleGraphConnection {
  
  inline def apply(
    active: Unit,
    addCondition: js.Function2[ModuleGraphConnection, /* arg1 */ RuntimeSpec, ConnectionState] => Unit,
    addExplanation: String => Unit,
    condition: (ModuleGraphConnection, RuntimeSpec) => ConnectionState,
    conditional: Boolean,
    explanation: String,
    explanations: Set[String],
    getActiveState: RuntimeSpec => ConnectionState,
    isActive: RuntimeSpec => Boolean,
    isTargetActive: RuntimeSpec => Boolean,
    module: Module,
    resolvedModule: Module,
    setActive: Boolean => Unit,
    weak: Boolean
  ): ModuleGraphConnection = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addCondition = js.Any.fromFunction1(addCondition), addExplanation = js.Any.fromFunction1(addExplanation), condition = js.Any.fromFunction2(condition), conditional = conditional.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], explanations = explanations.asInstanceOf[js.Any], getActiveState = js.Any.fromFunction1(getActiveState), isActive = js.Any.fromFunction1(isActive), isTargetActive = js.Any.fromFunction1(isTargetActive), module = module.asInstanceOf[js.Any], resolvedModule = resolvedModule.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), weak = weak.asInstanceOf[js.Any], dependency = null, originModule = null, resolvedOriginModule = null)
    __obj.asInstanceOf[ModuleGraphConnection]
  }
  
  extension [Self <: ModuleGraphConnection](x: Self) {
    
    inline def setActive(value: Unit): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAddCondition(value: js.Function2[ModuleGraphConnection, /* arg1 */ RuntimeSpec, ConnectionState] => Unit): Self = StObject.set(x, "addCondition", js.Any.fromFunction1(value))
    
    inline def setAddExplanation(value: String => Unit): Self = StObject.set(x, "addExplanation", js.Any.fromFunction1(value))
    
    inline def setCondition(value: (ModuleGraphConnection, RuntimeSpec) => ConnectionState): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
    
    inline def setConditional(value: Boolean): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyNull: Self = StObject.set(x, "dependency", null)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanations(value: Set[String]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setGetActiveState(value: RuntimeSpec => ConnectionState): Self = StObject.set(x, "getActiveState", js.Any.fromFunction1(value))
    
    inline def setIsActive(value: RuntimeSpec => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
    
    inline def setIsTargetActive(value: RuntimeSpec => Boolean): Self = StObject.set(x, "isTargetActive", js.Any.fromFunction1(value))
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setOriginModule(value: Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setOriginModuleNull: Self = StObject.set(x, "originModule", null)
    
    inline def setResolvedModule(value: Module): Self = StObject.set(x, "resolvedModule", value.asInstanceOf[js.Any])
    
    inline def setResolvedOriginModule(value: Module): Self = StObject.set(x, "resolvedOriginModule", value.asInstanceOf[js.Any])
    
    inline def setResolvedOriginModuleNull: Self = StObject.set(x, "resolvedOriginModule", null)
    
    inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
  }
}
