package typings
package yaddaLib.libFileSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/FileSearch", JSImport.Namespace)
@js.native
class ^ protected () extends FileSearch {
  def this(directories: java.lang.String) = this()
  def this(directories: java.lang.String, patterns: stdLib.RegExp) = this()
  /* CompleteClass */
  override def each(fn: js.Function1[/* file */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def list(): js.Array[java.lang.String] = js.native
}

