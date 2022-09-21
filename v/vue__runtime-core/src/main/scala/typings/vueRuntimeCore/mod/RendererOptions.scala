package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.anon.VNodePropskeystringany
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererOptions[HostNode, HostElement] extends StObject {
  
  var cloneNode: js.UndefOr[js.Function1[/* node */ HostNode, HostNode]] = js.native
  
  def createComment(text: String): HostNode = js.native
  
  def createElement(`type`: String): HostElement = js.native
  def createElement(`type`: String, isSVG: Boolean): HostElement = js.native
  def createElement(`type`: String, isSVG: Boolean, isCustomizedBuiltIn: String): HostElement = js.native
  def createElement(`type`: String, isSVG: Boolean, isCustomizedBuiltIn: String, vnodeProps: VNodePropskeystringany): HostElement = js.native
  def createElement(`type`: String, isSVG: Boolean, isCustomizedBuiltIn: Unit, vnodeProps: VNodePropskeystringany): HostElement = js.native
  def createElement(`type`: String, isSVG: Unit, isCustomizedBuiltIn: String): HostElement = js.native
  def createElement(`type`: String, isSVG: Unit, isCustomizedBuiltIn: String, vnodeProps: VNodePropskeystringany): HostElement = js.native
  def createElement(`type`: String, isSVG: Unit, isCustomizedBuiltIn: Unit, vnodeProps: VNodePropskeystringany): HostElement = js.native
  
  def createText(text: String): HostNode = js.native
  
  def insert(el: HostNode, parent: HostElement): Unit = js.native
  def insert(el: HostNode, parent: HostElement, anchor: HostNode): Unit = js.native
  
  var insertStaticContent: js.UndefOr[
    js.Function6[
      /* content */ String, 
      /* parent */ HostElement, 
      /* anchor */ HostNode | Null, 
      /* isSVG */ Boolean, 
      /* start */ js.UndefOr[HostNode | Null], 
      /* end */ js.UndefOr[HostNode | Null], 
      js.Tuple2[HostNode, HostNode]
    ]
  ] = js.native
  
  def nextSibling(node: HostNode): HostNode | Null = js.native
  
  def parentNode(node: HostNode): HostElement | Null = js.native
  
  def patchProp(
    el: HostElement,
    key: String,
    prevValue: Any,
    nextValue: Any,
    isSVG: js.UndefOr[Boolean],
    prevChildren: js.UndefOr[js.Array[VNode[HostNode, HostElement, StringDictionary[Any]]]],
    parentComponent: js.UndefOr[ComponentInternalInstance | Null],
    parentSuspense: js.UndefOr[SuspenseBoundary | Null],
    unmountChildren: js.UndefOr[UnmountChildrenFn]
  ): Unit = js.native
  
  var querySelector: js.UndefOr[js.Function1[/* selector */ String, HostElement | Null]] = js.native
  
  def remove(el: HostNode): Unit = js.native
  
  def setElementText(node: HostElement, text: String): Unit = js.native
  
  var setScopeId: js.UndefOr[js.Function2[/* el */ HostElement, /* id */ String, Unit]] = js.native
  
  def setText(node: HostNode, text: String): Unit = js.native
}
