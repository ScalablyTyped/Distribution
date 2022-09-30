package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryMod {
  
  type ArrayEntry[BaseType /* <: js.Array[Any] */] = js.Tuple2[
    Double, 
    /* import warning: importer.ImportType#apply Failed type conversion: BaseType[number] */ js.Any
  ]
  
  type Entry[BaseType] = ObjectEntry[BaseType] | ArrayEntry[BaseType] | SetEntry[BaseType] | MapEntry[BaseType]
  
  type MapEntry[BaseType] = js.Tuple2[MapKey[BaseType], MapValue[BaseType]]
  
  type MapKey[BaseType] = Any
  
  type MapValue[BaseType] = Any
  
  type ObjectEntry[BaseType] = js.Tuple2[
    /* keyof BaseType */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: BaseType[keyof BaseType] */ js.Any
  ]
  
  type SetEntry[BaseType] = js.Tuple2[Any, Any]
}
