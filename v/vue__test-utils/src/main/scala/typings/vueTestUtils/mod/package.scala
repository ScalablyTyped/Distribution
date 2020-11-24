package typings.vueTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Utility type for a selector
    */
  type Selector = java.lang.String | (typings.vue.optionsMod.Component[
    typings.vue.optionsMod.DefaultData[scala.Nothing], 
    typings.vue.optionsMod.DefaultMethods[scala.Nothing], 
    typings.vue.optionsMod.DefaultComputed, 
    typings.vue.optionsMod.DefaultProps
  ])
  
  type ShallowMountOptions[V /* <: typings.vue.vueMod.Vue */] = typings.vueTestUtils.mod.MountOptions[V]
  
  /**
    * Utility type for slots
    */
  type Slots = org.scalablytyped.runtime.StringDictionary[
    (js.Array[
      (typings.vue.optionsMod.Component[
        typings.vue.optionsMod.DefaultData[scala.Nothing], 
        typings.vue.optionsMod.DefaultMethods[scala.Nothing], 
        typings.vue.optionsMod.DefaultComputed, 
        typings.vue.optionsMod.DefaultProps
      ]) | java.lang.String
    ]) | (typings.vue.optionsMod.Component[
      typings.vue.optionsMod.DefaultData[scala.Nothing], 
      typings.vue.optionsMod.DefaultMethods[scala.Nothing], 
      typings.vue.optionsMod.DefaultComputed, 
      typings.vue.optionsMod.DefaultProps
    ]) | java.lang.String
  ]
  
  /**
    * Utility type for stubs which can be a string of template as a shorthand
    * If it is an array of string, the specified children are replaced by blank components
    */
  type Stubs = (org.scalablytyped.runtime.StringDictionary[
    (typings.vue.optionsMod.Component[
      typings.vue.optionsMod.DefaultData[scala.Nothing], 
      typings.vue.optionsMod.DefaultMethods[scala.Nothing], 
      typings.vue.optionsMod.DefaultComputed, 
      typings.vue.optionsMod.DefaultProps
    ]) | java.lang.String | scala.Boolean
  ]) | js.Array[java.lang.String]
  
  type ThisTypedMountOptions[V /* <: typings.vue.vueMod.Vue */] = typings.vueTestUtils.mod.MountOptions[V] with typings.std.ThisType[V]
  
  type ThisTypedShallowMountOptions[V /* <: typings.vue.vueMod.Vue */] = typings.vueTestUtils.mod.ShallowMountOptions[V] with typings.std.ThisType[V]
  
  /**
    * Utility type to declare an extended Vue constructor
    */
  type VueClass[V /* <: typings.vue.vueMod.Vue */] = (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, V]) with typings.vue.vueMod.VueConstructor[typings.vue.vueMod.Vue]
}
