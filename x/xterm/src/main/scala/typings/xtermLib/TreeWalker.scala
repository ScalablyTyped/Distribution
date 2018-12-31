package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeWalker extends js.Object {
  var currentNode: Node
  val filter: NodeFilter | scala.Null
  val root: Node
  val whatToShow: scala.Double
  def firstChild(): Node | scala.Null
  def lastChild(): Node | scala.Null
  def nextNode(): Node | scala.Null
  def nextSibling(): Node | scala.Null
  def parentNode(): Node | scala.Null
  def previousNode(): Node | scala.Null
  def previousSibling(): Node | scala.Null
}

@JSGlobal("TreeWalker")
@js.native
object TreeWalker
  extends org.scalablytyped.runtime.Instantiable0[TreeWalker]

