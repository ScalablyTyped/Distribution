package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Copyright extends StObject {
  
  var copyright: String
  
  var description: String
  
  var designer: String
  
  var designer_url: String
  
  var font_family_name: String
  
  var font_sub_family_name: String
  
  var full_font_name: String
  
  var license_description: String
  
  var license_url: String
  
  var manufacturer_name: String
  
  var postscript_name: String
  
  var trademark: String
  
  var unique_font_identifier: String
  
  var vendor_url: String
  
  var version_string: String
}
object Copyright {
  
  @scala.inline
  def apply(
    copyright: String,
    description: String,
    designer: String,
    designer_url: String,
    font_family_name: String,
    font_sub_family_name: String,
    full_font_name: String,
    license_description: String,
    license_url: String,
    manufacturer_name: String,
    postscript_name: String,
    trademark: String,
    unique_font_identifier: String,
    vendor_url: String,
    version_string: String
  ): Copyright = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], designer = designer.asInstanceOf[js.Any], designer_url = designer_url.asInstanceOf[js.Any], font_family_name = font_family_name.asInstanceOf[js.Any], font_sub_family_name = font_sub_family_name.asInstanceOf[js.Any], full_font_name = full_font_name.asInstanceOf[js.Any], license_description = license_description.asInstanceOf[js.Any], license_url = license_url.asInstanceOf[js.Any], manufacturer_name = manufacturer_name.asInstanceOf[js.Any], postscript_name = postscript_name.asInstanceOf[js.Any], trademark = trademark.asInstanceOf[js.Any], unique_font_identifier = unique_font_identifier.asInstanceOf[js.Any], vendor_url = vendor_url.asInstanceOf[js.Any], version_string = version_string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copyright]
  }
  
  @scala.inline
  implicit class CopyrightMutableBuilder[Self <: Copyright] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesigner(value: String): Self = StObject.set(x, "designer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesigner_url(value: String): Self = StObject.set(x, "designer_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_family_name(value: String): Self = StObject.set(x, "font_family_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_sub_family_name(value: String): Self = StObject.set(x, "font_sub_family_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_font_name(value: String): Self = StObject.set(x, "full_font_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense_description(value: String): Self = StObject.set(x, "license_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense_url(value: String): Self = StObject.set(x, "license_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer_name(value: String): Self = StObject.set(x, "manufacturer_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostscript_name(value: String): Self = StObject.set(x, "postscript_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrademark(value: String): Self = StObject.set(x, "trademark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique_font_identifier(value: String): Self = StObject.set(x, "unique_font_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor_url(value: String): Self = StObject.set(x, "vendor_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_string(value: String): Self = StObject.set(x, "version_string", value.asInstanceOf[js.Any])
  }
}
