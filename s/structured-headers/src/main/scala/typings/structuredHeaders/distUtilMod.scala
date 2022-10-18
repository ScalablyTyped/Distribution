package typings.structuredHeaders

import typings.structuredHeaders.distTypesMod.BareItem
import typings.structuredHeaders.distTypesMod.InnerList
import typings.structuredHeaders.distTypesMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("structured-headers/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAscii(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isByteSequence(input: BareItem): /* is structured-headers.structured-headers/dist/types.ByteSequence */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isByteSequence")(input.asInstanceOf[js.Any]).asInstanceOf[/* is structured-headers.structured-headers/dist/types.ByteSequence */ Boolean]
  
  inline def isInnerList(input: InnerList | Item): /* is structured-headers.structured-headers/dist/types.InnerList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInnerList")(input.asInstanceOf[js.Any]).asInstanceOf[/* is structured-headers.structured-headers/dist/types.InnerList */ Boolean]
  
  inline def isValidKeyStr(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidKeyStr")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTokenStr(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTokenStr")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
