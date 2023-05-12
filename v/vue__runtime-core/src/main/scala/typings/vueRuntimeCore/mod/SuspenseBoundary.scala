package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspenseBoundary extends StObject {
  
  var activeBranch: (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null = js.native
  
  var anchor: RendererNode | Null = js.native
  
  var container: RendererElement = js.native
  
  var deps: Double = js.native
  
  var effects: js.Array[js.Function] = js.native
  
  def fallback(fallbackVNode: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Unit = js.native
  
  var hiddenContainer: RendererElement = js.native
  
  var isHydrating: Boolean = js.native
  
  var isInFallback: Boolean = js.native
  
  var isSVG: Boolean = js.native
  
  var isUnmounted: Boolean = js.native
  
  def move(container: RendererElement, anchor: Null, `type`: MoveType): Unit = js.native
  def move(container: RendererElement, anchor: RendererNode, `type`: MoveType): Unit = js.native
  
  def next(): RendererNode | Null = js.native
  
  var parent: SuspenseBoundary | Null = js.native
  
  var parentComponent: ComponentInternalInstance | Null = js.native
  
  var pendingBranch: (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null = js.native
  
  var pendingId: Double = js.native
  
  def registerDep(instance: ComponentInternalInstance, setupRenderEffect: SetupRenderEffectFn): Unit = js.native
  
  def resolve(): Unit = js.native
  def resolve(force: Boolean): Unit = js.native
  def resolve(force: Boolean, sync: Boolean): Unit = js.native
  def resolve(force: Unit, sync: Boolean): Unit = js.native
  
  var timeout: Double = js.native
  
  def unmount(): Unit = js.native
  def unmount(parentSuspense: Null, doRemove: Boolean): Unit = js.native
  def unmount(parentSuspense: SuspenseBoundary): Unit = js.native
  def unmount(parentSuspense: SuspenseBoundary, doRemove: Boolean): Unit = js.native
  
  var vnode: VNode[RendererNode, RendererElement, SuspenseProps] = js.native
}
