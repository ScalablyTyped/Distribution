package typings.vuex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelpersMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.vue.typesVueMod.Vue

  type ActionMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type Computed = js.Function0[js.Any]
  type CustomVue = Vue with Dictionary[_]
  type Dictionary[T] = StringDictionary[T]
  type FunctionMapper[F, R] = js.Function1[
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* fn */ F, /* repeated */ js.Any, js.Any]
    ], 
    Dictionary[R]
  ]
  type FunctionMapperWithNamespace[F, R] = js.Function2[
    /* namespace */ String, 
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* fn */ F, /* repeated */ js.Any, js.Any]
    ], 
    Dictionary[R]
  ]
  type MapperForState = js.Function1[
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* state */ js.Any, /* getters */ js.Any, js.Any]
    ], 
    Dictionary[Computed]
  ]
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* state */ js.Any, /* getters */ js.Any, js.Any]
    ], 
    Dictionary[Computed]
  ]
  type MutationMethod = js.Function1[/* repeated */ js.Any, Unit]
}
