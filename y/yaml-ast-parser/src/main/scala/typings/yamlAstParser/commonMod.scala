package typings.yamlAstParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("yaml-ast-parser/dist/src/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend(target: Any, source: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isNegativeZero(number: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeZero")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNothing(subject: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNothing")(subject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(subject: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(subject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def repeat(string: Any, count: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toArray(sequence: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(sequence.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
