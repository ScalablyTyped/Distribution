package typings.xmldoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmldocStrings {
  
  @scala.inline
  def cdata: cdata = "cdata".asInstanceOf[cdata]
  
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait cdata extends js.Object
  
  @js.native
  sealed trait comment extends js.Object
  
  @js.native
  sealed trait element extends js.Object
  
  @js.native
  sealed trait text extends js.Object
}
