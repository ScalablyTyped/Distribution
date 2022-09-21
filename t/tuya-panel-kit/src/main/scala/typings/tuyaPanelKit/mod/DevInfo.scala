package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.tuyaPanelKit.anon.Bic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevInfo[S] extends StObject {
  
  var ability: Double
  
  var activeTime: Double
  
  /**
    * @deprecated
    */
  var appId: Double
  
  var appKey: String
  
  /**
    * @desc 网络是否在线
    */
  var appOnline: Boolean
  
  var attribute: Double
  
  var baseAttribute: Double
  
  var bv: Double
  
  var capability: Double
  
  var category: String
  
  var categoryCode: String
  
  var cloudOnline: Boolean
  
  var codeIds: Record[String, String]
  
  var communication: Record[String, Any]
  
  var devAttribute: Double
  
  var devId: String
  
  /**
    * @desc 设备是否在线
    */
  var deviceOnline: Boolean
  
  var deviceType: Double
  
  var displayDps: js.Array[Any]
  
  var displayMsgs: Record[String, Any]
  
  var displayOrder: Double
  
  var dpMaxTime: Double
  
  var dpName: Record[String | Double, String]
  
  var dps: Record[Double, String]
  
  var errorCode: Double
  
  var faultDps: js.Array[Any]
  
  var gatewayVerCAD: String
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var gwType: String
  
  var homeDisplayOrder: Double
  
  var homeId: Double
  
  var i18nTime: Double
  
  var iconUrl: String
  
  var idCodes: Record[Double, String]
  
  var ip: String
  
  var isAdmin: Boolean
  
  var isCloudOnline: Boolean
  
  /**
    * @desc 局域网是否在线
    */
  var isLocalOnline: Boolean
  
  var isMeshBleOnline: Boolean
  
  var isNewFirmware: Boolean
  
  var isShare: Boolean
  
  var isUniversalPanel: Boolean
  
  var isVDevice: Boolean
  
  var latitude: String
  
  var localKey: String
  
  var longitude: String
  
  var lpv: Double
  
  var meshId: String
  
  var name: String
  
  var networkType: NetworkType
  
  var originJson: Record[String, Any]
  
  var panelConfig: Bic
  
  var parentId: js.UndefOr[String] = js.undefined
  
  var pcc: String
  
  var productId: String
  
  var protocolAttribute: Double
  
  var pv: Double
  
  var quickOpDps: js.Array[Any]
  
  var rnFind: Boolean
  
  var roomId: Double
  
  var runtimeEnv: String
  
  var schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo & TopLevel[Any]
  
  var schemaExt: String
  
  var sharedTime: Double
  
  var sigmeshId: String
  
  var standSchemaModel: Record[String, Any]
  
  var standard: Boolean
  
  var state: S
  
  var supportGroup: Boolean
  
  var supportSGroup: Boolean
  
  var timezoneId: String
  
  var ui: String
  
  var uiId: String
  
  var uiPhase: String
  
  var uiType: String
  
  var uiVersion: String
  
  var upgrading: Boolean
  
  var uuid: String
  
  var vendorInfo: String
  
  var verSw: String
  
  var virtual: Boolean
}
object DevInfo {
  
  inline def apply[S](
    ability: Double,
    activeTime: Double,
    appId: Double,
    appKey: String,
    appOnline: Boolean,
    attribute: Double,
    baseAttribute: Double,
    bv: Double,
    capability: Double,
    category: String,
    categoryCode: String,
    cloudOnline: Boolean,
    codeIds: Record[String, String],
    communication: Record[String, Any],
    devAttribute: Double,
    devId: String,
    deviceOnline: Boolean,
    deviceType: Double,
    displayDps: js.Array[Any],
    displayMsgs: Record[String, Any],
    displayOrder: Double,
    dpMaxTime: Double,
    dpName: Record[String | Double, String],
    dps: Record[Double, String],
    errorCode: Double,
    faultDps: js.Array[Any],
    gatewayVerCAD: String,
    gwType: String,
    homeDisplayOrder: Double,
    homeId: Double,
    i18nTime: Double,
    iconUrl: String,
    idCodes: Record[Double, String],
    ip: String,
    isAdmin: Boolean,
    isCloudOnline: Boolean,
    isLocalOnline: Boolean,
    isMeshBleOnline: Boolean,
    isNewFirmware: Boolean,
    isShare: Boolean,
    isUniversalPanel: Boolean,
    isVDevice: Boolean,
    latitude: String,
    localKey: String,
    longitude: String,
    lpv: Double,
    meshId: String,
    name: String,
    networkType: NetworkType,
    originJson: Record[String, Any],
    panelConfig: Bic,
    pcc: String,
    productId: String,
    protocolAttribute: Double,
    pv: Double,
    quickOpDps: js.Array[Any],
    rnFind: Boolean,
    roomId: Double,
    runtimeEnv: String,
    schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo & TopLevel[Any],
    schemaExt: String,
    sharedTime: Double,
    sigmeshId: String,
    standSchemaModel: Record[String, Any],
    standard: Boolean,
    state: S,
    supportGroup: Boolean,
    supportSGroup: Boolean,
    timezoneId: String,
    ui: String,
    uiId: String,
    uiPhase: String,
    uiType: String,
    uiVersion: String,
    upgrading: Boolean,
    uuid: String,
    vendorInfo: String,
    verSw: String,
    virtual: Boolean
  ): DevInfo[S] = {
    val __obj = js.Dynamic.literal(ability = ability.asInstanceOf[js.Any], activeTime = activeTime.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appKey = appKey.asInstanceOf[js.Any], appOnline = appOnline.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], baseAttribute = baseAttribute.asInstanceOf[js.Any], bv = bv.asInstanceOf[js.Any], capability = capability.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], categoryCode = categoryCode.asInstanceOf[js.Any], cloudOnline = cloudOnline.asInstanceOf[js.Any], codeIds = codeIds.asInstanceOf[js.Any], communication = communication.asInstanceOf[js.Any], devAttribute = devAttribute.asInstanceOf[js.Any], devId = devId.asInstanceOf[js.Any], deviceOnline = deviceOnline.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayDps = displayDps.asInstanceOf[js.Any], displayMsgs = displayMsgs.asInstanceOf[js.Any], displayOrder = displayOrder.asInstanceOf[js.Any], dpMaxTime = dpMaxTime.asInstanceOf[js.Any], dpName = dpName.asInstanceOf[js.Any], dps = dps.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], faultDps = faultDps.asInstanceOf[js.Any], gatewayVerCAD = gatewayVerCAD.asInstanceOf[js.Any], gwType = gwType.asInstanceOf[js.Any], homeDisplayOrder = homeDisplayOrder.asInstanceOf[js.Any], homeId = homeId.asInstanceOf[js.Any], i18nTime = i18nTime.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], idCodes = idCodes.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any], isCloudOnline = isCloudOnline.asInstanceOf[js.Any], isLocalOnline = isLocalOnline.asInstanceOf[js.Any], isMeshBleOnline = isMeshBleOnline.asInstanceOf[js.Any], isNewFirmware = isNewFirmware.asInstanceOf[js.Any], isShare = isShare.asInstanceOf[js.Any], isUniversalPanel = isUniversalPanel.asInstanceOf[js.Any], isVDevice = isVDevice.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], localKey = localKey.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], lpv = lpv.asInstanceOf[js.Any], meshId = meshId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any], originJson = originJson.asInstanceOf[js.Any], panelConfig = panelConfig.asInstanceOf[js.Any], pcc = pcc.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], protocolAttribute = protocolAttribute.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], quickOpDps = quickOpDps.asInstanceOf[js.Any], rnFind = rnFind.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any], runtimeEnv = runtimeEnv.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaExt = schemaExt.asInstanceOf[js.Any], sharedTime = sharedTime.asInstanceOf[js.Any], sigmeshId = sigmeshId.asInstanceOf[js.Any], standSchemaModel = standSchemaModel.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], supportGroup = supportGroup.asInstanceOf[js.Any], supportSGroup = supportSGroup.asInstanceOf[js.Any], timezoneId = timezoneId.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], uiId = uiId.asInstanceOf[js.Any], uiPhase = uiPhase.asInstanceOf[js.Any], uiType = uiType.asInstanceOf[js.Any], uiVersion = uiVersion.asInstanceOf[js.Any], upgrading = upgrading.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendorInfo = vendorInfo.asInstanceOf[js.Any], verSw = verSw.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevInfo[S]]
  }
  
  extension [Self <: DevInfo[?], S](x: Self & DevInfo[S]) {
    
    inline def setAbility(value: Double): Self = StObject.set(x, "ability", value.asInstanceOf[js.Any])
    
    inline def setActiveTime(value: Double): Self = StObject.set(x, "activeTime", value.asInstanceOf[js.Any])
    
    inline def setAppId(value: Double): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setAppOnline(value: Boolean): Self = StObject.set(x, "appOnline", value.asInstanceOf[js.Any])
    
    inline def setAttribute(value: Double): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setBaseAttribute(value: Double): Self = StObject.set(x, "baseAttribute", value.asInstanceOf[js.Any])
    
    inline def setBv(value: Double): Self = StObject.set(x, "bv", value.asInstanceOf[js.Any])
    
    inline def setCapability(value: Double): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryCode(value: String): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    inline def setCloudOnline(value: Boolean): Self = StObject.set(x, "cloudOnline", value.asInstanceOf[js.Any])
    
    inline def setCodeIds(value: Record[String, String]): Self = StObject.set(x, "codeIds", value.asInstanceOf[js.Any])
    
    inline def setCommunication(value: Record[String, Any]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    inline def setDevAttribute(value: Double): Self = StObject.set(x, "devAttribute", value.asInstanceOf[js.Any])
    
    inline def setDevId(value: String): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    inline def setDeviceOnline(value: Boolean): Self = StObject.set(x, "deviceOnline", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: Double): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDisplayDps(value: js.Array[Any]): Self = StObject.set(x, "displayDps", value.asInstanceOf[js.Any])
    
    inline def setDisplayDpsVarargs(value: Any*): Self = StObject.set(x, "displayDps", js.Array(value*))
    
    inline def setDisplayMsgs(value: Record[String, Any]): Self = StObject.set(x, "displayMsgs", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrder(value: Double): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    inline def setDpMaxTime(value: Double): Self = StObject.set(x, "dpMaxTime", value.asInstanceOf[js.Any])
    
    inline def setDpName(value: Record[String | Double, String]): Self = StObject.set(x, "dpName", value.asInstanceOf[js.Any])
    
    inline def setDps(value: Record[Double, String]): Self = StObject.set(x, "dps", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setFaultDps(value: js.Array[Any]): Self = StObject.set(x, "faultDps", value.asInstanceOf[js.Any])
    
    inline def setFaultDpsVarargs(value: Any*): Self = StObject.set(x, "faultDps", js.Array(value*))
    
    inline def setGatewayVerCAD(value: String): Self = StObject.set(x, "gatewayVerCAD", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGwType(value: String): Self = StObject.set(x, "gwType", value.asInstanceOf[js.Any])
    
    inline def setHomeDisplayOrder(value: Double): Self = StObject.set(x, "homeDisplayOrder", value.asInstanceOf[js.Any])
    
    inline def setHomeId(value: Double): Self = StObject.set(x, "homeId", value.asInstanceOf[js.Any])
    
    inline def setI18nTime(value: Double): Self = StObject.set(x, "i18nTime", value.asInstanceOf[js.Any])
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIdCodes(value: Record[Double, String]): Self = StObject.set(x, "idCodes", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIsAdmin(value: Boolean): Self = StObject.set(x, "isAdmin", value.asInstanceOf[js.Any])
    
    inline def setIsCloudOnline(value: Boolean): Self = StObject.set(x, "isCloudOnline", value.asInstanceOf[js.Any])
    
    inline def setIsLocalOnline(value: Boolean): Self = StObject.set(x, "isLocalOnline", value.asInstanceOf[js.Any])
    
    inline def setIsMeshBleOnline(value: Boolean): Self = StObject.set(x, "isMeshBleOnline", value.asInstanceOf[js.Any])
    
    inline def setIsNewFirmware(value: Boolean): Self = StObject.set(x, "isNewFirmware", value.asInstanceOf[js.Any])
    
    inline def setIsShare(value: Boolean): Self = StObject.set(x, "isShare", value.asInstanceOf[js.Any])
    
    inline def setIsUniversalPanel(value: Boolean): Self = StObject.set(x, "isUniversalPanel", value.asInstanceOf[js.Any])
    
    inline def setIsVDevice(value: Boolean): Self = StObject.set(x, "isVDevice", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLocalKey(value: String): Self = StObject.set(x, "localKey", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLpv(value: Double): Self = StObject.set(x, "lpv", value.asInstanceOf[js.Any])
    
    inline def setMeshId(value: String): Self = StObject.set(x, "meshId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkType(value: NetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    inline def setOriginJson(value: Record[String, Any]): Self = StObject.set(x, "originJson", value.asInstanceOf[js.Any])
    
    inline def setPanelConfig(value: Bic): Self = StObject.set(x, "panelConfig", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setPcc(value: String): Self = StObject.set(x, "pcc", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProtocolAttribute(value: Double): Self = StObject.set(x, "protocolAttribute", value.asInstanceOf[js.Any])
    
    inline def setPv(value: Double): Self = StObject.set(x, "pv", value.asInstanceOf[js.Any])
    
    inline def setQuickOpDps(value: js.Array[Any]): Self = StObject.set(x, "quickOpDps", value.asInstanceOf[js.Any])
    
    inline def setQuickOpDpsVarargs(value: Any*): Self = StObject.set(x, "quickOpDps", js.Array(value*))
    
    inline def setRnFind(value: Boolean): Self = StObject.set(x, "rnFind", value.asInstanceOf[js.Any])
    
    inline def setRoomId(value: Double): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnv(value: String): Self = StObject.set(x, "runtimeEnv", value.asInstanceOf[js.Any])
    
    inline def setSchema(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
      */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo & TopLevel[Any]
    ): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaExt(value: String): Self = StObject.set(x, "schemaExt", value.asInstanceOf[js.Any])
    
    inline def setSharedTime(value: Double): Self = StObject.set(x, "sharedTime", value.asInstanceOf[js.Any])
    
    inline def setSigmeshId(value: String): Self = StObject.set(x, "sigmeshId", value.asInstanceOf[js.Any])
    
    inline def setStandSchemaModel(value: Record[String, Any]): Self = StObject.set(x, "standSchemaModel", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSupportGroup(value: Boolean): Self = StObject.set(x, "supportGroup", value.asInstanceOf[js.Any])
    
    inline def setSupportSGroup(value: Boolean): Self = StObject.set(x, "supportSGroup", value.asInstanceOf[js.Any])
    
    inline def setTimezoneId(value: String): Self = StObject.set(x, "timezoneId", value.asInstanceOf[js.Any])
    
    inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiId(value: String): Self = StObject.set(x, "uiId", value.asInstanceOf[js.Any])
    
    inline def setUiPhase(value: String): Self = StObject.set(x, "uiPhase", value.asInstanceOf[js.Any])
    
    inline def setUiType(value: String): Self = StObject.set(x, "uiType", value.asInstanceOf[js.Any])
    
    inline def setUiVersion(value: String): Self = StObject.set(x, "uiVersion", value.asInstanceOf[js.Any])
    
    inline def setUpgrading(value: Boolean): Self = StObject.set(x, "upgrading", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setVendorInfo(value: String): Self = StObject.set(x, "vendorInfo", value.asInstanceOf[js.Any])
    
    inline def setVerSw(value: String): Self = StObject.set(x, "verSw", value.asInstanceOf[js.Any])
    
    inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
  }
}
