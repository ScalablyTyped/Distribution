package typings.terraSpacer

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.HTMLDivElement
import typings.terraSpacer.anon.PartialSpacerProps
import typings.terraSpacer.anon.Sizes
import typings.terraSpacer.anon.WeakValidationMapSpacerPr
import typings.terraSpacer.terraSpacerStrings.`small-1`
import typings.terraSpacer.terraSpacerStrings.`small-2`
import typings.terraSpacer.terraSpacerStrings.large
import typings.terraSpacer.terraSpacerStrings.largePlussign1
import typings.terraSpacer.terraSpacerStrings.largePlussign2
import typings.terraSpacer.terraSpacerStrings.largePlussign3
import typings.terraSpacer.terraSpacerStrings.largePlussign4
import typings.terraSpacer.terraSpacerStrings.medium
import typings.terraSpacer.terraSpacerStrings.none
import typings.terraSpacer.terraSpacerStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpacerMod {
  
  /* Inlined react.react.FC<terra-spacer.terra-spacer/lib/Spacer.SpacerProps> & {  Opts :{  Sizes :terra-spacer.terra-spacer/lib/Spacer.SpacerSizes}} */
  object default {
    
    inline def apply(props: SpacerProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: SpacerProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("terra-spacer/lib/Spacer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("terra-spacer/lib/Spacer", "default.Opts")
    @js.native
    def Opts: Sizes = js.native
    inline def Opts_=(x: Sizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Opts")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer/lib/Spacer", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer/lib/Spacer", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSpacerProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSpacerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer/lib/Spacer", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-spacer/lib/Spacer", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSpacerPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSpacerPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait SpacerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Sets the display to be inline-block.
      */
    var isInlineBlock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets margin in a syntax similar to the standard CSS spec https://developer.mozilla.org/en-US/docs/Web/CSS/margin.
      * One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var margin: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ] = js.undefined
    
    /**
      * Sets bottom margin. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var marginBottom: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets left margin One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var marginLeft: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets right margin. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var marginRight: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets top margin. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var marginTop: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets padding in a syntax similar to the standard CSS spec https://developer.mozilla.org/en-US/docs/Web/CSS/padding.
      * One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var padding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ] = js.undefined
    
    /**
      * Sets bottom padding. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var paddingBottom: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets left padding. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var paddingLeft: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets right padding. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var paddingRight: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    /**
      * Sets top padding. One of 'none', 'small-2', 'small-1', 'small', 'medium', 'large', 'large+1', 'large+2', 'large+3', 'large+4'.
      */
    var paddingTop: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
  }
  object SpacerProps {
    
    inline def apply(): SpacerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpacerProps]
    }
    
    extension [Self <: SpacerProps](x: Self) {
      
      inline def setIsInlineBlock(value: Boolean): Self = StObject.set(x, "isInlineBlock", value.asInstanceOf[js.Any])
      
      inline def setIsInlineBlockUndefined: Self = StObject.set(x, "isInlineBlock", js.undefined)
      
      inline def setMargin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  trait SpacerSizes extends StObject {
    
    var LARGE: large
    
    @JSName("LARGE+1")
    var LARGEPlussign1: largePlussign1
    
    @JSName("LARGE+2")
    var LARGEPlussign2: largePlussign2
    
    @JSName("LARGE+3")
    var LARGEPlussign3: largePlussign3
    
    @JSName("LARGE+4")
    var LARGEPlussign4: largePlussign4
    
    var MEDIUM: medium
    
    var NONE: none
    
    var SMALL: small
    
    var `SMALL-1`: `small-1`
    
    var `SMALL-2`: `small-2`
  }
  object SpacerSizes {
    
    inline def apply(): SpacerSizes = {
      val __obj = js.Dynamic.literal(LARGE = "large", MEDIUM = "medium", NONE = "none", SMALL = "small")
      __obj.updateDynamic("LARGE+1")("large+1")
      __obj.updateDynamic("LARGE+2")("large+2")
      __obj.updateDynamic("LARGE+3")("large+3")
      __obj.updateDynamic("LARGE+4")("large+4")
      __obj.updateDynamic("SMALL-1")("small-1")
      __obj.updateDynamic("SMALL-2")("small-2")
      __obj.asInstanceOf[SpacerSizes]
    }
    
    extension [Self <: SpacerSizes](x: Self) {
      
      inline def setLARGE(value: large): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
      
      inline def setLARGEPlussign1(value: largePlussign1): Self = StObject.set(x, "LARGE+1", value.asInstanceOf[js.Any])
      
      inline def setLARGEPlussign2(value: largePlussign2): Self = StObject.set(x, "LARGE+2", value.asInstanceOf[js.Any])
      
      inline def setLARGEPlussign3(value: largePlussign3): Self = StObject.set(x, "LARGE+3", value.asInstanceOf[js.Any])
      
      inline def setLARGEPlussign4(value: largePlussign4): Self = StObject.set(x, "LARGE+4", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM(value: medium): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: none): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setSMALL(value: small): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
      
      inline def `setSMALL-1`(value: `small-1`): Self = StObject.set(x, "SMALL-1", value.asInstanceOf[js.Any])
      
      inline def `setSMALL-2`(value: `small-2`): Self = StObject.set(x, "SMALL-2", value.asInstanceOf[js.Any])
    }
  }
}
