package typings.xelib.mod

import typings.xelib.mod.^
import typings.xelib.xelibInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def wrapper: XELib = ^.asInstanceOf[js.Dynamic].selectDynamic("wrapper").asInstanceOf[XELib]

type ContainerHandle = Handle & js.Object

type ElementHandle = Handle & js.Object

type FileHandle = ContainerHandle & js.Object

type Handle = Double

type I[T] = T

type NodeTreeHandle = Handle & js.Object

type RecordHandle = ElementHandle & js.Object

type Zeroable[H /* <: Handle */] = H | `0`
