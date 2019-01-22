package typings
package tstlLib.experimentalAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait IContainer[T, Iterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator]] */] extends js.Object {
  def begin(): Iterator
  def end(): Iterator
  def erase(first: Iterator, last: Iterator): Iterator
}

