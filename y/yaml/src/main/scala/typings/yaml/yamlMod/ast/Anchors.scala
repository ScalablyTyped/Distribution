package typings.yaml.yamlMod.ast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchors extends js.Object {
  /**
    * Create a new `Alias` node, adding the required anchor for `node`.
    * If `name` is empty, a new anchor name will be generated.
    */
  def createAlias(node: Node): Alias = js.native
  def createAlias(node: Node, name: String): Alias = js.native
  /**
    * Create a new `Merge` node with the given source nodes.
    * Non-`Alias` sources will be automatically wrapped.
    */
  def createMergePair(nodes: Node*): Merge = js.native
  /**
    * The anchor name associated with `node`, if set.
    */
  def getName(node: Node): js.UndefOr[String] = js.native
  /**
    * The node associated with the anchor `name`, if set.
    */
  def getNode(name: String): js.UndefOr[Node] = js.native
  /**
    * Find an available anchor name with the given `prefix` and a numerical suffix.
    */
  def newName(prefix: String): String = js.native
  def setAnchor(): Unit | String = js.native
  def setAnchor(node: Null, name: String): Unit | String = js.native
  /**
    * Associate an anchor with `node`. If `name` is empty, a new name will be generated.
    * To remove an anchor, use `setAnchor(null, name)`.
    */
  def setAnchor(node: Node): Unit | String = js.native
  def setAnchor(node: Node, name: String): Unit | String = js.native
}

