package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IntersectionObserver extends js.Object {
  val root: Element | scala.Null
  val rootMargin: java.lang.String
  val thresholds: js.Array[scala.Double]
  def disconnect(): scala.Unit
  def observe(target: Element): scala.Unit
  def takeRecords(): js.Array[IntersectionObserverEntry]
  def unobserve(target: Element): scala.Unit
}

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends ScalablyTyped.runtime.Instantiable1[/* callback */ IntersectionObserverCallback, IntersectionObserver]
     with ScalablyTyped.runtime.Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      IntersectionObserver
    ]

