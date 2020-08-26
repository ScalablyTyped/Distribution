package typings.vueComponentCompilerUtils.compileTemplateMod

import typings.vueComponentCompilerUtils.assetUrlMod.AssetURLOptions
import typings.vueComponentCompilerUtils.assetUrlMod.TransformAssetUrlsOptions
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCompileOptions extends js.Object {
  var compiler: VueTemplateCompiler = js.native
  var compilerOptions: js.UndefOr[VueTemplateCompilerOptions] = js.native
  var filename: String = js.native
  var isFunctional: js.UndefOr[Boolean] = js.native
  var isProduction: js.UndefOr[Boolean] = js.native
  var optimizeSSR: js.UndefOr[Boolean] = js.native
  var preprocessLang: js.UndefOr[String] = js.native
  var preprocessOptions: js.UndefOr[js.Any] = js.native
  var prettify: js.UndefOr[Boolean] = js.native
  var source: String = js.native
  var transformAssetUrls: js.UndefOr[AssetURLOptions | Boolean] = js.native
  var transformAssetUrlsOptions: js.UndefOr[TransformAssetUrlsOptions] = js.native
  var transpileOptions: js.UndefOr[js.Any] = js.native
}

object TemplateCompileOptions {
  @scala.inline
  def apply(compiler: VueTemplateCompiler, filename: String, source: String): TemplateCompileOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCompileOptions]
  }
  @scala.inline
  implicit class TemplateCompileOptionsOps[Self <: TemplateCompileOptions] (val x: Self) extends AnyVal {
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
    def setCompiler(value: VueTemplateCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompilerOptions(value: VueTemplateCompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    @scala.inline
    def setIsFunctional(value: Boolean): Self = this.set("isFunctional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFunctional: Self = this.set("isFunctional", js.undefined)
    @scala.inline
    def setIsProduction(value: Boolean): Self = this.set("isProduction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsProduction: Self = this.set("isProduction", js.undefined)
    @scala.inline
    def setOptimizeSSR(value: Boolean): Self = this.set("optimizeSSR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizeSSR: Self = this.set("optimizeSSR", js.undefined)
    @scala.inline
    def setPreprocessLang(value: String): Self = this.set("preprocessLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreprocessLang: Self = this.set("preprocessLang", js.undefined)
    @scala.inline
    def setPreprocessOptions(value: js.Any): Self = this.set("preprocessOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreprocessOptions: Self = this.set("preprocessOptions", js.undefined)
    @scala.inline
    def setPrettify(value: Boolean): Self = this.set("prettify", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettify: Self = this.set("prettify", js.undefined)
    @scala.inline
    def setTransformAssetUrls(value: AssetURLOptions | Boolean): Self = this.set("transformAssetUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformAssetUrls: Self = this.set("transformAssetUrls", js.undefined)
    @scala.inline
    def setTransformAssetUrlsOptions(value: TransformAssetUrlsOptions): Self = this.set("transformAssetUrlsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformAssetUrlsOptions: Self = this.set("transformAssetUrlsOptions", js.undefined)
    @scala.inline
    def setTranspileOptions(value: js.Any): Self = this.set("transpileOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranspileOptions: Self = this.set("transpileOptions", js.undefined)
  }
  
}

