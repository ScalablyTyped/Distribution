package typings.typedoc

import typings.std.Record
import typings.typedoc.anon.ArrowStyle
import typings.typedoc.anon.HideSources
import typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart
import typings.typedoc.distLibModelsMod.ContainerReflection
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibModelsMod.ReferenceReflection
import typings.typedoc.distLibModelsMod.ReferenceType
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsMod.ReflectionGroup
import typings.typedoc.distLibModelsMod.SignatureReflection
import typings.typedoc.distLibModelsMod.Type
import typings.typedoc.distLibModelsMod.TypeParameterReflection
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationHierarchy
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibOutputMod.PageEvent
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeMod.DefaultTheme
import typings.typedoc.distLibUtilsGeneralMod.NeverIfInternal
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import typings.typedoc.distLibUtilsMod.Options
import typings.typedoc.typedocStrings.anchor
import typings.typedoc.typedocStrings.bodyDotbegin
import typings.typedoc.typedocStrings.bodyDotend
import typings.typedoc.typedocStrings.checkbox
import typings.typedoc.typedocStrings.chevronDown
import typings.typedoc.typedocStrings.chevronSmall
import typings.typedoc.typedocStrings.contentDotbegin
import typings.typedoc.typedocStrings.contentDotend
import typings.typedoc.typedocStrings.headDotbegin
import typings.typedoc.typedocStrings.headDotend
import typings.typedoc.typedocStrings.menu
import typings.typedoc.typedocStrings.navigationDotbegin
import typings.typedoc.typedocStrings.navigationDotend
import typings.typedoc.typedocStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultDefaultThemeRenderContextMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/DefaultThemeRenderContext", "DefaultThemeRenderContext")
  @js.native
  open class DefaultThemeRenderContext protected () extends StObject {
    def this(theme: DefaultTheme, options: Options) = this()
    
    def analytics(): js.UndefOr[JsxElement] = js.native
    
    /**
      * Using this method will repeat work already done, instead of calling it, use `type.externalUrl`.
      * @deprecated
      * Will be removed in 0.24.
      */
    def attemptExternalResolution(`type`: NeverIfInternal[ReferenceType]): js.UndefOr[String] = js.native
    
    def breadcrumb(props: Reflection): js.UndefOr[JsxElement] = js.native
    
    def comment(props: Reflection): js.UndefOr[JsxElement] = js.native
    
    def defaultLayout(props: PageEvent[Reflection]): JsxElement = js.native
    
    def footer(): js.UndefOr[JsxElement] = js.native
    
    def header(props: PageEvent[Reflection]): JsxElement = js.native
    
    def hierarchy(): js.UndefOr[JsxElement] = js.native
    def hierarchy(props: DeclarationHierarchy): js.UndefOr[JsxElement] = js.native
    
    def hook(
      name: /* keyof typedoc.typedoc/dist/lib/output/renderer.RendererHooks */ headDotbegin | headDotend | bodyDotbegin | bodyDotend | contentDotbegin | contentDotend | navigationDotbegin | navigationDotend
    ): js.Array[JsxElement] = js.native
    
    var icons: Record[
        anchor | ReflectionKind | search | checkbox | chevronDown | menu | chevronSmall, 
        js.Function0[JsxElement]
      ] = js.native
    
    def index(props: ContainerReflection): JsxElement = js.native
    
    def indexTemplate(props: PageEvent[ProjectReflection]): JsxElement = js.native
    
    def markdown(md: js.Array[CommentDisplayPart]): String = js.native
    def markdown(md: NeverIfInternal[js.UndefOr[String]]): String = js.native
    
    def member(props: DeclarationReflection): JsxElement = js.native
    
    def memberDeclaration(props: DeclarationReflection): JsxElement = js.native
    
    def memberGetterSetter(props: DeclarationReflection): JsxElement = js.native
    
    def memberReference(props: ReferenceReflection): JsxElement = js.native
    
    def memberSignatureBody(r_0: SignatureReflection): JsxElement = js.native
    def memberSignatureBody(r_0: SignatureReflection, r_1: HideSources): JsxElement = js.native
    
    def memberSignatureTitle(r_0: SignatureReflection): JsxElement = js.native
    def memberSignatureTitle(r_0: SignatureReflection, r_1: ArrowStyle): JsxElement = js.native
    
    def memberSignatures(props: DeclarationReflection): JsxElement = js.native
    
    def memberSources(props: DeclarationReflection): JsxElement = js.native
    def memberSources(props: SignatureReflection): JsxElement = js.native
    
    def members(props: ContainerReflection): JsxElement = js.native
    
    def membersGroup(group: ReflectionGroup): JsxElement = js.native
    
    def navigation(props: PageEvent[Reflection]): JsxElement = js.native
    
    var options: Options = js.native
    
    def parameter(props: DeclarationReflection): JsxElement = js.native
    
    def primaryNavigation(props: PageEvent[Reflection]): JsxElement = js.native
    
    def reflectionTemplate(props: PageEvent[ContainerReflection]): JsxElement = js.native
    
    /** Avoid this in favor of urlTo if possible */
    def relativeURL(): js.UndefOr[String] = js.native
    def relativeURL(url: String): js.UndefOr[String] = js.native
    
    def secondaryNavigation(props: PageEvent[Reflection]): js.UndefOr[JsxElement] = js.native
    
    def settings(): JsxElement = js.native
    
    def sidebarLinks(): JsxElement | Null = js.native
    
    /* private */ var theme: Any = js.native
    
    def toolbar(props: PageEvent[Reflection]): JsxElement = js.native
    
    def `type`(): JsxElement = js.native
    def `type`(`type`: Type): JsxElement = js.native
    
    def typeAndParent(props: Type): JsxElement = js.native
    
    def typeParameters(typeParameters: js.Array[TypeParameterReflection]): JsxElement = js.native
    
    def urlTo(reflection: Reflection): js.UndefOr[String] = js.native
  }
}
