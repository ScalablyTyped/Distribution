package typings.yallist.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConstructor
  extends Instantiable1[/* value */ js.Object, Node[js.Object]]
     with Instantiable2[/* value */ js.Object, /* prev */ Node[js.Object], Node[js.Object]]
     with Instantiable3[
      /* value */ js.Object, 
      js.UndefOr[/* prev */ Node[js.Object]], 
      /* next */ Node[js.Object], 
      Node[js.Object]
    ]
     with Instantiable4[
      /* value */ js.Object, 
      js.UndefOr[/* prev */ Node[js.Object]], 
      js.UndefOr[/* next */ Node[js.Object]], 
      /* list */ Yallist[js.Object], 
      Node[js.Object]
    ] {
  
  def apply[T](value: T): Node[T] = js.native
  def apply[T](value: T, prev: js.UndefOr[scala.Nothing], next: js.UndefOr[scala.Nothing], list: Yallist[T]): Node[T] = js.native
  def apply[T](value: T, prev: js.UndefOr[scala.Nothing], next: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: js.UndefOr[scala.Nothing], next: Node[T], list: Yallist[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: js.UndefOr[scala.Nothing], list: Yallist[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: Node[T], list: Yallist[T]): Node[T] = js.native
}
