package typings.vueClassComponent

import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecorators extends js.Object {
  var __decorators__ : js.UndefOr[
    js.Array[
      js.Function1[
        /* options */ ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ], 
        Unit
      ]
    ]
  ] = js.undefined
}

object AnonDecorators {
  @scala.inline
  def apply(
    __decorators__ : js.Array[
      js.Function1[
        /* options */ ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ], 
        Unit
      ]
    ] = null
  ): AnonDecorators = {
    val __obj = js.Dynamic.literal()
    if (__decorators__ != null) __obj.updateDynamic("__decorators__")(__decorators__.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecorators]
  }
}

