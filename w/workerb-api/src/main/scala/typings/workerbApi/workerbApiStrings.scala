package typings.workerbApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerbApiStrings {
  
  @scala.inline
  def by_id: by_id = "by_id".asInstanceOf[by_id]
  
  @scala.inline
  def by_label: by_label = "by_label".asInstanceOf[by_label]
  
  @scala.inline
  def by_placeholder: by_placeholder = "by_placeholder".asInstanceOf[by_placeholder]
  
  @scala.inline
  def by_query_selector: by_query_selector = "by_query_selector".asInstanceOf[by_query_selector]
  
  @scala.inline
  def by_query_selector_all: by_query_selector_all = "by_query_selector_all".asInstanceOf[by_query_selector_all]
  
  @scala.inline
  def by_regex: by_regex = "by_regex".asInstanceOf[by_regex]
  
  @scala.inline
  def by_text: by_text = "by_text".asInstanceOf[by_text]
  
  @scala.inline
  def by_xpath: by_xpath = "by_xpath".asInstanceOf[by_xpath]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @scala.inline
  def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  
  @scala.inline
  def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait by_id
    extends clickQueryMethods
       with getAttributeQueryMethods
       with typeQueryMethods
  
  @js.native
  sealed trait by_label extends typeQueryMethods
  
  @js.native
  sealed trait by_placeholder extends typeQueryMethods
  
  @js.native
  sealed trait by_query_selector
    extends clickQueryMethods
       with getAttributeQueryMethods
       with typeQueryMethods
  
  @js.native
  sealed trait by_query_selector_all extends getAttributeQueryMethods
  
  @js.native
  sealed trait by_regex
    extends clickQueryMethods
       with getAttributeQueryMethods
       with typeQueryMethods
  
  @js.native
  sealed trait by_text
    extends clickQueryMethods
       with getAttributeQueryMethods
       with typeQueryMethods
  
  @js.native
  sealed trait by_xpath
    extends clickQueryMethods
       with getAttributeQueryMethods
       with typeQueryMethods
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait keydown extends js.Object
  
  @js.native
  sealed trait keyup extends js.Object
  
  @js.native
  sealed trait mousedown extends js.Object
  
  @js.native
  sealed trait mouseenter extends js.Object
  
  @js.native
  sealed trait mouseleave extends js.Object
  
  @js.native
  sealed trait mousemove extends js.Object
  
  @js.native
  sealed trait mouseout extends js.Object
  
  @js.native
  sealed trait mouseover extends js.Object
  
  @js.native
  sealed trait mouseup extends js.Object
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait on extends js.Object
  
  @js.native
  sealed trait success extends js.Object
}
