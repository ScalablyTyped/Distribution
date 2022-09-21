package typings.webpack.mod

import typings.std.Map
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenerationResults extends StObject {
  
  def add(module: Module, runtime: RuntimeSpec, result: CodeGenerationResult): Unit
  
  def get(module: Module, runtime: RuntimeSpec): CodeGenerationResult
  
  def getData(module: Module, runtime: RuntimeSpec, key: String): Any
  
  def getHash(module: Module, runtime: RuntimeSpec): Any
  
  def getRuntimeRequirements(module: Module, runtime: RuntimeSpec): ReadonlySet[String]
  
  def getSource(module: Module, runtime: RuntimeSpec, sourceType: String): Source
  
  def has(module: Module, runtime: RuntimeSpec): Boolean
  
  var map: Map[Module, RuntimeSpecMap[CodeGenerationResult]]
}
object CodeGenerationResults {
  
  inline def apply(
    add: (Module, RuntimeSpec, CodeGenerationResult) => Unit,
    get: (Module, RuntimeSpec) => CodeGenerationResult,
    getData: (Module, RuntimeSpec, String) => Any,
    getHash: (Module, RuntimeSpec) => Any,
    getRuntimeRequirements: (Module, RuntimeSpec) => ReadonlySet[String],
    getSource: (Module, RuntimeSpec, String) => Source,
    has: (Module, RuntimeSpec) => Boolean,
    map: Map[Module, RuntimeSpecMap[CodeGenerationResult]]
  ): CodeGenerationResults = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), get = js.Any.fromFunction2(get), getData = js.Any.fromFunction3(getData), getHash = js.Any.fromFunction2(getHash), getRuntimeRequirements = js.Any.fromFunction2(getRuntimeRequirements), getSource = js.Any.fromFunction3(getSource), has = js.Any.fromFunction2(has), map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenerationResults]
  }
  
  extension [Self <: CodeGenerationResults](x: Self) {
    
    inline def setAdd(value: (Module, RuntimeSpec, CodeGenerationResult) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setGet(value: (Module, RuntimeSpec) => CodeGenerationResult): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetData(value: (Module, RuntimeSpec, String) => Any): Self = StObject.set(x, "getData", js.Any.fromFunction3(value))
    
    inline def setGetHash(value: (Module, RuntimeSpec) => Any): Self = StObject.set(x, "getHash", js.Any.fromFunction2(value))
    
    inline def setGetRuntimeRequirements(value: (Module, RuntimeSpec) => ReadonlySet[String]): Self = StObject.set(x, "getRuntimeRequirements", js.Any.fromFunction2(value))
    
    inline def setGetSource(value: (Module, RuntimeSpec, String) => Source): Self = StObject.set(x, "getSource", js.Any.fromFunction3(value))
    
    inline def setHas(value: (Module, RuntimeSpec) => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
    
    inline def setMap(value: Map[Module, RuntimeSpecMap[CodeGenerationResult]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
