package typings.webpackBlocksCore.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Util extends js.Object {
  
  def addLoader(
    loaderDefinition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuleSetRule */ js.Any
  ): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
  ] = js.native
  
  def addPlugin(plugin: Plugin): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
  ] = js.native
  
  def merge(
    configSnippet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
  ] = js.native
}
object Util {
  
  @scala.inline
  def apply(
    addLoader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuleSetRule */ js.Any => js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
    ],
    addPlugin: Plugin => js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
    ],
    merge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any => js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
    ]
  ): Util = {
    val __obj = js.Dynamic.literal(addLoader = js.Any.fromFunction1(addLoader), addPlugin = js.Any.fromFunction1(addPlugin), merge = js.Any.fromFunction1(merge))
    __obj.asInstanceOf[Util]
  }
  
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddLoader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuleSetRule */ js.Any => js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
        ]
    ): Self = this.set("addLoader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPlugin(
      value: Plugin => js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
        ]
    ): Self = this.set("addPlugin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMerge(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any => js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
        ]
    ): Self = this.set("merge", js.Any.fromFunction1(value))
  }
}
