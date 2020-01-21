package typings.testingLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncFireObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Promise<void>}
    */ typings.testingLibraryVue.testingLibraryVueStrings.AsyncFireObject with js.Any
  type ConfigurationCallback[V /* <: typings.vue.vueMod.Vue */] = js.Function3[
    /* vue */ V, 
    /* store */ typings.vuex.mod.Store[js.Any], 
    /* router */ typings.vueRouter.mod.default, 
    (typings.std.Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> */ js.Any
    ]) | scala.Unit
  ]
}
