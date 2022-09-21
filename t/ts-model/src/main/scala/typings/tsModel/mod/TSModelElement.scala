package typings.tsModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSModelElement")
@js.native
open class TSModelElement[T /* <: TSModelElement[Any] */] ()
  extends StObject
     with IModelElement {
  def this(parent: TSModelElement[Any]) = this()
  def this(parent: Unit, config: IConfig) = this()
  def this(parent: TSModelElement[Any], config: IConfig) = this()
  
  /* private */ var _annotations: Any = js.native
  
  /* private */ var _children: Any = js.native
  
  var _comment: String = js.native
  
  /* protected */ var _config: IConfig = js.native
  
  /* protected */ var _parent: TSModelElement[Any] = js.native
  
  def addChild(child: T): Unit = js.native
  
  def annotations(): js.Array[IAnnotationReference] = js.native
  
  def children(): js.Array[T] = js.native
  
  def comment(): String = js.native
  
  def isEmpty(): Boolean = js.native
  
  var meta: StringDictionary[Any] = js.native
  
  /* CompleteClass */
  override def modelClass(): String = js.native
  
  def parent(): TSModelElement[Any] = js.native
  
  def patchParent(parent: TSModelElement[Any]): Unit = js.native
  
  def removeChild(child: T): Unit = js.native
  
  def root(): TSAPIModule = js.native
  
  def serializeToString(): String = js.native
  def serializeToString(isImpl: Boolean): String = js.native
  
  /* protected */ def setParent(parent: TSModelElement[Any]): Unit = js.native
}
