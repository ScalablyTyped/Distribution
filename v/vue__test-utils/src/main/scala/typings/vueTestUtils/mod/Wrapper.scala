package typings.vueTestUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.FunctionalComponentOptions
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import typings.vueTestUtils.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wrapper[V /* <: Vue | Null */] extends BaseWrapper {
  
  val element: HTMLElement = js.native
  
  def emitted(): StringDictionary[js.UndefOr[js.Array[js.Array[_]]]] = js.native
  def emitted(event: String): js.UndefOr[js.Array[_]] = js.native
  
  def emittedByOrder(): js.Array[Args] = js.native
  
  def find(selector: String): Wrapper[Vue] = js.native
  def find(selector: NameSelector): Wrapper[Vue] = js.native
  def find(selector: RefSelector): Wrapper[Vue] = js.native
  def find[R /* <: Vue */](
    selector: ComponentOptions[
      R, 
      DefaultData[R], 
      DefaultMethods[R], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[R] = js.native
  def find[R /* <: Vue */](selector: VueClass[R]): Wrapper[R] = js.native
  def find[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
  
  def findAll(selector: String): WrapperArray[Vue] = js.native
  def findAll(selector: NameSelector): WrapperArray[Vue] = js.native
  def findAll(selector: RefSelector): WrapperArray[Vue] = js.native
  def findAll[R /* <: Vue */](
    selector: ComponentOptions[
      R, 
      DefaultData[R], 
      DefaultMethods[R], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): WrapperArray[R] = js.native
  def findAll[R /* <: Vue */](selector: VueClass[R]): WrapperArray[R] = js.native
  def findAll[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): WrapperArray[Vue] = js.native
  
  def findAllComponents(selector: NameSelector): WrapperArray[Vue] = js.native
  def findAllComponents(selector: RefSelector): WrapperArray[Vue] = js.native
  def findAllComponents[R /* <: Vue */](
    selector: ComponentOptions[
      R, 
      DefaultData[R], 
      DefaultMethods[R], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): WrapperArray[R] = js.native
  def findAllComponents[R /* <: Vue */](selector: VueClass[R]): WrapperArray[R] = js.native
  def findAllComponents[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): WrapperArray[Vue] = js.native
  
  def findComponent(selector: NameSelector): Wrapper[Vue] = js.native
  def findComponent(selector: RefSelector): Wrapper[Vue] = js.native
  def findComponent[R /* <: Vue */](
    selector: ComponentOptions[
      R, 
      DefaultData[R], 
      DefaultMethods[R], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[R] = js.native
  def findComponent[R /* <: Vue */](selector: VueClass[R]): Wrapper[R] = js.native
  def findComponent[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
  
  def get(selector: String): Wrapper[Vue] = js.native
  def get(selector: NameSelector): Wrapper[Vue] = js.native
  def get(selector: RefSelector): Wrapper[Vue] = js.native
  def get[R /* <: Vue */](
    selector: ComponentOptions[
      R, 
      DefaultData[R], 
      DefaultMethods[R], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[R] = js.native
  def get[R /* <: Vue */](selector: VueClass[R]): Wrapper[R] = js.native
  def get[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
  
  def html(): String = js.native
  
  def name(): String = js.native
  
  val options: WrapperOptions = js.native
  
  def text(): String = js.native
  
  val vm: V = js.native
}
