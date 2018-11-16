package typings
package yallistLib.yallistMod.YallistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeConstructor
  extends ScalablyTyped.runtime.Instantiable1[/* value */ js.Object, Node[js.Object]]
     with ScalablyTyped.runtime.Instantiable2[/* value */ js.Object, /* prev */ Node[js.Object], Node[js.Object]]
     with ScalablyTyped.runtime.Instantiable3[
      /* value */ js.Object, 
      /* prev */ Node[js.Object], 
      /* next */ Node[js.Object], 
      Node[js.Object]
    ]
     with ScalablyTyped.runtime.Instantiable4[
      /* value */ js.Object, 
      /* prev */ Node[js.Object], 
      /* next */ Node[js.Object], 
      /* list */ yallistLib.yallistMod.Yallist[js.Object], 
      Node[js.Object]
    ] {
  def apply[T](value: T): Node[T] = js.native
  def apply[T](value: T, prev: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: Node[T], list: yallistLib.yallistMod.Yallist[T]): Node[T] = js.native
}

