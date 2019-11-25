package typings.vueDashClassDashComponent

import typings.vue.typesOptionsMod.ComponentOptions
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.PropsDefinition
import typings.vue.typesVueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decorators extends js.Object {
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

object Anon_Decorators {
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
  ): Anon_Decorators = {
    val __obj = js.Dynamic.literal()
    if (__decorators__ != null) __obj.updateDynamic("__decorators__")(__decorators__.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Decorators]
  }
}

