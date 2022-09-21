package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importSpacingRuleMod {
  
  @JSImport("tslint/lib/rules/importSpacingRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.ADD_SPACE_AFTER_FROM")
    @js.native
    def ADD_SPACE_AFTER_FROM: String = js.native
    inline def ADD_SPACE_AFTER_FROM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD_SPACE_AFTER_FROM")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.ADD_SPACE_AFTER_IMPORT")
    @js.native
    def ADD_SPACE_AFTER_IMPORT: String = js.native
    inline def ADD_SPACE_AFTER_IMPORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD_SPACE_AFTER_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.ADD_SPACE_AFTER_STAR")
    @js.native
    def ADD_SPACE_AFTER_STAR: String = js.native
    inline def ADD_SPACE_AFTER_STAR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD_SPACE_AFTER_STAR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.ADD_SPACE_BEFORE_FROM")
    @js.native
    def ADD_SPACE_BEFORE_FROM: String = js.native
    inline def ADD_SPACE_BEFORE_FROM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD_SPACE_BEFORE_FROM")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.NO_LINE_BREAKS")
    @js.native
    def NO_LINE_BREAKS: String = js.native
    inline def NO_LINE_BREAKS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_LINE_BREAKS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.TOO_MANY_SPACES_AFTER_FROM")
    @js.native
    def TOO_MANY_SPACES_AFTER_FROM: String = js.native
    inline def TOO_MANY_SPACES_AFTER_FROM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_MANY_SPACES_AFTER_FROM")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.TOO_MANY_SPACES_AFTER_IMPORT")
    @js.native
    def TOO_MANY_SPACES_AFTER_IMPORT: String = js.native
    inline def TOO_MANY_SPACES_AFTER_IMPORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_MANY_SPACES_AFTER_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.TOO_MANY_SPACES_AFTER_STAR")
    @js.native
    def TOO_MANY_SPACES_AFTER_STAR: String = js.native
    inline def TOO_MANY_SPACES_AFTER_STAR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_MANY_SPACES_AFTER_STAR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.TOO_MANY_SPACES_BEFORE_FROM")
    @js.native
    def TOO_MANY_SPACES_BEFORE_FROM: String = js.native
    inline def TOO_MANY_SPACES_BEFORE_FROM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_MANY_SPACES_BEFORE_FROM")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importSpacingRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
