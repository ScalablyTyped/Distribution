package typings.xstate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchemaMod {
  
  @JSImport("xstate/lib/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSchema[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")().asInstanceOf[T]
  inline def createSchema[T](schema: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def t[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("t")().asInstanceOf[T]
  inline def t[T](schema: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(schema.asInstanceOf[js.Any]).asInstanceOf[T]
}
