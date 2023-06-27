package typings.terraSpacer

import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.terraSpacer.anon.PartialSpacerProps
import typings.terraSpacer.anon.Sizes
import typings.terraSpacer.anon.WeakValidationMapSpacerPr
import typings.terraSpacer.libSpacerMod.SpacerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined react.react.FC<terra-spacer.terra-spacer/lib/Spacer.SpacerProps> & {  Opts :{  Sizes :terra-spacer.terra-spacer/lib/Spacer.SpacerSizes}} */
  object default {
    
    inline def apply(props: SpacerProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: SpacerProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("terra-spacer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("terra-spacer", "default.Opts")
    @js.native
    def Opts: Sizes = js.native
    inline def Opts_=(x: Sizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Opts")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSpacerProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSpacerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSpacerPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSpacerPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
