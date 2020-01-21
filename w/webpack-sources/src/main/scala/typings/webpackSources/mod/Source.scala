package typings.webpackSources.mod

import typings.node.cryptoMod.Hash
import typings.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "Source")
@js.native
abstract class Source () extends js.Object {
  def listMap(): js.Any = js.native
  def listMap(options: js.Any): js.Any = js.native
  def listNode(): js.Any = js.native
  def listNode(options: js.Any): js.Any = js.native
  def map(): js.Any = js.native
  def map(options: js.Any): js.Any = js.native
  def node(): js.Any = js.native
  def node(options: js.Any): js.Any = js.native
  def size(): Double = js.native
  def source(): String = js.native
  def source(options: js.Any): String = js.native
  def sourceAndMap(): AnonMap = js.native
  def sourceAndMap(options: js.Any): AnonMap = js.native
  def updateHash(hash: Hash): Unit = js.native
}

