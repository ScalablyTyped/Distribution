package typings.svgParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object svgParserStrings {
  @js.native
  sealed trait element extends js.Object
  
  @js.native
  sealed trait root extends js.Object
  
  @js.native
  sealed trait text extends js.Object
  
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}

