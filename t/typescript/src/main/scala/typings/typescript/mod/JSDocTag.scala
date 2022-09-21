package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTag
  extends StObject
     with Node {
  
  val comment: js.UndefOr[java.lang.String | NodeArray[JSDocComment]] = js.native
  
  @JSName("parent")
  val parent_JSDocTag: JSDoc | JSDocTypeLiteral = js.native
  
  val tagName: Identifier = js.native
}
