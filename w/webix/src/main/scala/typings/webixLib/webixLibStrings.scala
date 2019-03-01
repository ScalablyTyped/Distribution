package typings
package webixLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webixLibStrings {
  @js.native
  sealed trait onAfterAdd
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterAreaAdd
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterAreaRemove
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterBack
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterBlockSelect
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterClose
    extends webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterCollapse
    extends webixLib.webixMod.uiNs.accordionEventName
       with webixLib.webixMod.uiNs.headerlayoutEventName
       with webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onAfterColumnDrop
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterColumnDropOrder
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterColumnHide
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterColumnShow
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterContextMenu
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterCreateFolder
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterCursorChange
    extends DataCollectionEventName
       with TreeCollectionEventName
  
  @js.native
  sealed trait onAfterDateSelect
    extends webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.daterangeEventName
  
  @js.native
  sealed trait onAfterDelete
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterDeleteFile
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterDrop
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterDropOrder
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterDynParse
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterEditFile
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterEditStart
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterEditStop
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterExpand
    extends webixLib.webixMod.uiNs.accordionEventName
       with webixLib.webixMod.uiNs.headerlayoutEventName
       with webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onAfterFileAdd
    extends webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onAfterFileUpload
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterFilter
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterHideTree
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterLevelDown
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterLevelUp
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterLoad
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.dbllistEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterMarkCopy
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterMarkCut
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterMenu
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterModeChange
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterMonthChange
    extends webixLib.webixMod.uiNs.calendarEventName
  
  @js.native
  sealed trait onAfterOpen
    extends webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterPageChange
    extends webixLib.webixMod.uiNs.pagerEventName
  
  @js.native
  sealed trait onAfterPasteFile
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterPathClick
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterPortletMove
    extends webixLib.webixMod.uiNs.portletEventName
  
  @js.native
  sealed trait onAfterRangeChange
    extends webixLib.webixMod.uiNs.rangechartEventName
  
  @js.native
  sealed trait onAfterRender
    extends webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onAfterRun
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterScroll
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onAfterSearch
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterSelect
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterSheetShow
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onAfterShowTree
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterSort
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onAfterStart
    extends webixLib.webixMod.uiNs.hintEventName
  
  @js.native
  sealed trait onAfterStatusChange
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onAfterTabClick
    extends webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.tabbarEventName
  
  @js.native
  sealed trait onAfterUnSelect
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAfterUploadDialog
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onAfterValidation
    extends webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.toolbarEventName
  
  @js.native
  sealed trait onAfterZoom
    extends webixLib.webixMod.uiNs.calendarEventName
  
  @js.native
  sealed trait onApply
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onAreaDrag
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onAvatarClick
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onBeforeAdd
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeApply
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onBeforeAreaAdd
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeAreaRemove
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeBack
    extends webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.multiviewEventName
  
  @js.native
  sealed trait onBeforeBlockSelect
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeCancel
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onBeforeClose
    extends webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeColumnDrag
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeColumnDrop
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeColumnDropOrder
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeColumnHide
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeColumnShow
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeContextMenu
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeCreateFolder
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeCursorChange
    extends DataCollectionEventName
       with TreeCollectionEventName
  
  @js.native
  sealed trait onBeforeDateSelect
    extends webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.daterangeEventName
  
  @js.native
  sealed trait onBeforeDelete
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeDeleteFile
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeDrag
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeDragIn
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeDrop
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeDropOrder
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeDropOut
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeDynLoad
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeDynParse
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeEditFile
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeEditStart
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeEditStop
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeFileAdd
    extends webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onBeforeFileUpload
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeFilter
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeHideTree
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeLevelDown
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeLevelUp
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeLoad
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.dbllistEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeMarkCopy
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeMarkCut
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeMenu
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeModeChange
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeMonthChange
    extends webixLib.webixMod.uiNs.calendarEventName
  
  @js.native
  sealed trait onBeforeOpen
    extends webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforePageChange
    extends webixLib.webixMod.uiNs.pagerEventName
  
  @js.native
  sealed trait onBeforePasteFile
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforePortletMove
    extends webixLib.webixMod.uiNs.portletEventName
  
  @js.native
  sealed trait onBeforeRender
    extends webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onBeforeRequest
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeRun
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeSearch
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeSearchRequest
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeSelect
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeSheetShow
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onBeforeShow
    extends webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onBeforeShowTree
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeSort
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onBeforeSpan
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onBeforeSplit
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onBeforeStart
    extends webixLib.webixMod.uiNs.hintEventName
  
  @js.native
  sealed trait onBeforeStatusChange
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onBeforeTabClick
    extends webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.tabbarEventName
  
  @js.native
  sealed trait onBeforeTabClose
    extends webixLib.webixMod.uiNs.tabbarEventName
  
  @js.native
  sealed trait onBeforeUnSelect
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onBeforeUploadDialog
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onBeforeValidate
    extends webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.toolbarEventName
  
  @js.native
  sealed trait onBeforeValueChange
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onBeforeZoom
    extends webixLib.webixMod.uiNs.calendarEventName
  
  @js.native
  sealed trait onBindRequest
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.abslayoutEventName
       with webixLib.webixMod.uiNs.accordionEventName
       with webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.baselayoutEventName
       with webixLib.webixMod.uiNs.baseviewEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.dashboardEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangeEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.dbllistEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridlayoutEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.headerlayoutEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.layoutEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.multiviewEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.panelEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.portletEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.querybuilderEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.richtextEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.tabviewEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onBindUpdate
    extends DataCollectionEventName
       with TreeCollectionEventName
  
  @js.native
  sealed trait onBlur
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onCancel
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onCellChange
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onChange
    extends webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.dashboardEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangeEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.dbllistEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.gridlayoutEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.richtextEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.toolbarEventName
  
  @js.native
  sealed trait onCheck
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onCollectValues
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onColumnResize
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onComponentInit
    extends webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onCopyError
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onDataParse
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onDataRequest
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onDataSerialize
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onDataUpdate
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onDateClear
    extends webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.daterangeEventName
  
  @js.native
  sealed trait onDateSelect
    extends webixLib.webixMod.uiNs.calendarEventName
  
  @js.native
  sealed trait onDestruct
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.abslayoutEventName
       with webixLib.webixMod.uiNs.accordionEventName
       with webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.baselayoutEventName
       with webixLib.webixMod.uiNs.baseviewEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.dashboardEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangeEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.dbllistEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridlayoutEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.headerlayoutEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.layoutEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.multiviewEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.panelEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.portletEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.querybuilderEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.richtextEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.tabviewEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onDocumentReady
    extends webixLib.webixMod.uiNs.pdfviewerEventName
  
  @js.native
  sealed trait onDragOut
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onDynLoadError
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onEditorChange
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onEnd
    extends webixLib.webixMod.uiNs.hintEventName
  
  @js.native
  sealed trait onEnter
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onErrorResponse
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onFileUpload
    extends webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onFileUploadError
    extends webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onFilterChange
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onFilterCreate
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onFocus
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onFolderSelect
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onHeaderClick
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onHeaderInit
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onHeatMapRender
    extends webixLib.webixMod.uiNs.googleMapEventName
  
  @js.native
  sealed trait onHide
    extends webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onHideSearchResults
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onHistoryChange
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onItemCheck
    extends webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onItemClick
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onItemDblClick
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onItemRename
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onItemRender
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onItemSelect
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onKeyPress
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onKeySelect
    extends webixLib.webixMod.uiNs.querybuilderEventName
  
  @js.native
  sealed trait onListAfterContextMenu
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListAfterDrop
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListAfterSelect
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListBeforeContextMenu
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListBeforeDrag
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListBeforeDragIn
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListBeforeDrop
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListBeforeSelect
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListIconClick
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListItemClick
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onListItemDblClick
    extends webixLib.webixMod.uiNs.kanbanEventName
  
  @js.native
  sealed trait onLiveEdit
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onLoadError
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datalayoutEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.dbllistEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.kanbanEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.pivotEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.spreadsheetEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onLongTouch
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onMapError
    extends webixLib.webixMod.uiNs.geochartEventName
  
  @js.native
  sealed trait onMapReady
    extends webixLib.webixMod.uiNs.geochartEventName
  
  @js.native
  sealed trait onMathRefresh
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onMenuItemClick
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.submenuEventName
  
  @js.native
  sealed trait onMouseMove
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onMouseMoving
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onMouseOut
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onMoveError
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onNext
    extends webixLib.webixMod.uiNs.hintEventName
  
  @js.native
  sealed trait onOptionRemove
    extends webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.tabbarEventName
  
  @js.native
  sealed trait onPageRender
    extends webixLib.webixMod.uiNs.pdfviewerEventName
  
  @js.native
  sealed trait onPartialRender
    extends webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
  
  @js.native
  sealed trait onPaste
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onPathComplete
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onPathLevel
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onPopup
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onPrevious
    extends webixLib.webixMod.uiNs.hintEventName
  
  @js.native
  sealed trait onRegionClick
    extends webixLib.webixMod.uiNs.geochartEventName
  
  @js.native
  sealed trait onReset
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onResize
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.resizeareaEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onResizeEnd
    extends webixLib.webixMod.uiNs.resizeareaEventName
  
  @js.native
  sealed trait onRowResize
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onScaleChange
    extends webixLib.webixMod.uiNs.pdfviewerEventName
  
  @js.native
  sealed trait onScroll extends js.Object
  
  @js.native
  sealed trait onScrollX
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onScrollY
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onSearchIconClick
    extends webixLib.webixMod.uiNs.searchEventName
  
  @js.native
  sealed trait onSectionAdd
    extends webixLib.webixMod.uiNs.multitextEventName
  
  @js.native
  sealed trait onSectionRemove
    extends webixLib.webixMod.uiNs.multitextEventName
  
  @js.native
  sealed trait onSelect
    extends webixLib.webixMod.uiNs.colorboardEventName
  
  @js.native
  sealed trait onSelectChange
    extends webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onSheetAdd
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onSheetRemove
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onSheetRename
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onShow
    extends webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onShowSearchResults
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onSkip
    extends webixLib.webixMod.uiNs.hintEventName
  
  @js.native
  sealed trait onSliderDrag
    extends webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.sliderEventName
  
  @js.native
  sealed trait onStructureLoad
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onStructureUpdate
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onStyleSet
    extends webixLib.webixMod.uiNs.spreadsheetEventName
  
  @js.native
  sealed trait onSubViewClose
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onSubViewCreate
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onSubViewOpen
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onSubViewRender
    extends webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.treetableEventName
  
  @js.native
  sealed trait onSubmit
    extends webixLib.webixMod.uiNs.formEventName
  
  @js.native
  sealed trait onSuccessResponse
    extends webixLib.webixMod.uiNs.filemanagerEventName
  
  @js.native
  sealed trait onSwipeX
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onSwipeY
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onTimedKeyPress
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onTodaySet
    extends webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.daterangeEventName
  
  @js.native
  sealed trait onTouchEnd
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onTouchMove
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onTouchStart
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onUploadComplete
    extends webixLib.webixMod.uiNs.uploaderEventName
  
  @js.native
  sealed trait onValidationError
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onValidationSuccess
    extends DataCollectionEventName
       with TreeCollectionEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.toolbarEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
  
  @js.native
  sealed trait onValueSuggest
    extends webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.suggestEventName
  
  @js.native
  sealed trait onValues
    extends webixLib.webixMod.uiNs.formEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.toolbarEventName
  
  @js.native
  sealed trait onViewChange
    extends webixLib.webixMod.uiNs.multiviewEventName
  
  @js.native
  sealed trait onViewInit
    extends webixLib.webixMod.uiNs.filemanagerEventName
       with webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onViewMove
    extends webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onViewMoveEnd
    extends webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onViewResize
    extends webixLib.webixMod.uiNs.accordionitemEventName
       with webixLib.webixMod.uiNs.barcodeEventName
       with webixLib.webixMod.uiNs.bulletEventName
       with webixLib.webixMod.uiNs.buttonEventName
       with webixLib.webixMod.uiNs.calendarEventName
       with webixLib.webixMod.uiNs.carouselEventName
       with webixLib.webixMod.uiNs.chartEventName
       with webixLib.webixMod.uiNs.checkboxEventName
       with webixLib.webixMod.uiNs.checksuggestEventName
       with webixLib.webixMod.uiNs.colorboardEventName
       with webixLib.webixMod.uiNs.colorpickerEventName
       with webixLib.webixMod.uiNs.comboEventName
       with webixLib.webixMod.uiNs.contextEventName
       with webixLib.webixMod.uiNs.contextmenuEventName
       with webixLib.webixMod.uiNs.counterEventName
       with webixLib.webixMod.uiNs.datasuggestEventName
       with webixLib.webixMod.uiNs.datatableEventName
       with webixLib.webixMod.uiNs.dataviewEventName
       with webixLib.webixMod.uiNs.datepickerEventName
       with webixLib.webixMod.uiNs.daterangepickerEventName
       with webixLib.webixMod.uiNs.daterangesuggestEventName
       with webixLib.webixMod.uiNs.excelviewerEventName
       with webixLib.webixMod.uiNs.fieldsetEventName
       with webixLib.webixMod.uiNs.forminputEventName
       with webixLib.webixMod.uiNs.gageEventName
       with webixLib.webixMod.uiNs.geochartEventName
       with webixLib.webixMod.uiNs.googleMapEventName
       with webixLib.webixMod.uiNs.gridsuggestEventName
       with webixLib.webixMod.uiNs.grouplistEventName
       with webixLib.webixMod.uiNs.hintEventName
       with webixLib.webixMod.uiNs.htmlformEventName
       with webixLib.webixMod.uiNs.iconEventName
       with webixLib.webixMod.uiNs.iframeEventName
       with webixLib.webixMod.uiNs.labelEventName
       with webixLib.webixMod.uiNs.listEventName
       with webixLib.webixMod.uiNs.menuEventName
       with webixLib.webixMod.uiNs.multicomboEventName
       with webixLib.webixMod.uiNs.multiselectEventName
       with webixLib.webixMod.uiNs.multisuggestEventName
       with webixLib.webixMod.uiNs.multitextEventName
       with webixLib.webixMod.uiNs.organogramEventName
       with webixLib.webixMod.uiNs.pagerEventName
       with webixLib.webixMod.uiNs.panelEventName
       with webixLib.webixMod.uiNs.pdfviewerEventName
       with webixLib.webixMod.uiNs.popupEventName
       with webixLib.webixMod.uiNs.propertyEventName
       with webixLib.webixMod.uiNs.protoEventName
       with webixLib.webixMod.uiNs.radioEventName
       with webixLib.webixMod.uiNs.rangechartEventName
       with webixLib.webixMod.uiNs.rangesliderEventName
       with webixLib.webixMod.uiNs.resizerEventName
       with webixLib.webixMod.uiNs.richselectEventName
       with webixLib.webixMod.uiNs.scrollviewEventName
       with webixLib.webixMod.uiNs.searchEventName
       with webixLib.webixMod.uiNs.segmentedEventName
       with webixLib.webixMod.uiNs.selectEventName
       with webixLib.webixMod.uiNs.sidebarEventName
       with webixLib.webixMod.uiNs.sidemenuEventName
       with webixLib.webixMod.uiNs.sliderEventName
       with webixLib.webixMod.uiNs.spacerEventName
       with webixLib.webixMod.uiNs.submenuEventName
       with webixLib.webixMod.uiNs.suggestEventName
       with webixLib.webixMod.uiNs.switchButtonEventName
       with webixLib.webixMod.uiNs.tabbarEventName
       with webixLib.webixMod.uiNs.templateEventName
       with webixLib.webixMod.uiNs.textEventName
       with webixLib.webixMod.uiNs.textareaEventName
       with webixLib.webixMod.uiNs.toggleEventName
       with webixLib.webixMod.uiNs.tooltipEventName
       with webixLib.webixMod.uiNs.treeEventName
       with webixLib.webixMod.uiNs.treemapEventName
       with webixLib.webixMod.uiNs.treetableEventName
       with webixLib.webixMod.uiNs.unitlistEventName
       with webixLib.webixMod.uiNs.uploaderEventName
       with webixLib.webixMod.uiNs.videoEventName
       with webixLib.webixMod.uiNs.viewEventName
       with webixLib.webixMod.uiNs.windowEventName
  
  @js.native
  sealed trait onWebWorkerEnd
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @js.native
  sealed trait onWebWorkerStart
    extends webixLib.webixMod.uiNs.pivotEventName
  
  @scala.inline
  def onAfterAdd: onAfterAdd = "onAfterAdd".asInstanceOf[onAfterAdd]
  @scala.inline
  def onAfterAreaAdd: onAfterAreaAdd = "onAfterAreaAdd".asInstanceOf[onAfterAreaAdd]
  @scala.inline
  def onAfterAreaRemove: onAfterAreaRemove = "onAfterAreaRemove".asInstanceOf[onAfterAreaRemove]
  @scala.inline
  def onAfterBack: onAfterBack = "onAfterBack".asInstanceOf[onAfterBack]
  @scala.inline
  def onAfterBlockSelect: onAfterBlockSelect = "onAfterBlockSelect".asInstanceOf[onAfterBlockSelect]
  @scala.inline
  def onAfterClose: onAfterClose = "onAfterClose".asInstanceOf[onAfterClose]
  @scala.inline
  def onAfterCollapse: onAfterCollapse = "onAfterCollapse".asInstanceOf[onAfterCollapse]
  @scala.inline
  def onAfterColumnDrop: onAfterColumnDrop = "onAfterColumnDrop".asInstanceOf[onAfterColumnDrop]
  @scala.inline
  def onAfterColumnDropOrder: onAfterColumnDropOrder = "onAfterColumnDropOrder".asInstanceOf[onAfterColumnDropOrder]
  @scala.inline
  def onAfterColumnHide: onAfterColumnHide = "onAfterColumnHide".asInstanceOf[onAfterColumnHide]
  @scala.inline
  def onAfterColumnShow: onAfterColumnShow = "onAfterColumnShow".asInstanceOf[onAfterColumnShow]
  @scala.inline
  def onAfterContextMenu: onAfterContextMenu = "onAfterContextMenu".asInstanceOf[onAfterContextMenu]
  @scala.inline
  def onAfterCreateFolder: onAfterCreateFolder = "onAfterCreateFolder".asInstanceOf[onAfterCreateFolder]
  @scala.inline
  def onAfterCursorChange: onAfterCursorChange = "onAfterCursorChange".asInstanceOf[onAfterCursorChange]
  @scala.inline
  def onAfterDateSelect: onAfterDateSelect = "onAfterDateSelect".asInstanceOf[onAfterDateSelect]
  @scala.inline
  def onAfterDelete: onAfterDelete = "onAfterDelete".asInstanceOf[onAfterDelete]
  @scala.inline
  def onAfterDeleteFile: onAfterDeleteFile = "onAfterDeleteFile".asInstanceOf[onAfterDeleteFile]
  @scala.inline
  def onAfterDrop: onAfterDrop = "onAfterDrop".asInstanceOf[onAfterDrop]
  @scala.inline
  def onAfterDropOrder: onAfterDropOrder = "onAfterDropOrder".asInstanceOf[onAfterDropOrder]
  @scala.inline
  def onAfterDynParse: onAfterDynParse = "onAfterDynParse".asInstanceOf[onAfterDynParse]
  @scala.inline
  def onAfterEditFile: onAfterEditFile = "onAfterEditFile".asInstanceOf[onAfterEditFile]
  @scala.inline
  def onAfterEditStart: onAfterEditStart = "onAfterEditStart".asInstanceOf[onAfterEditStart]
  @scala.inline
  def onAfterEditStop: onAfterEditStop = "onAfterEditStop".asInstanceOf[onAfterEditStop]
  @scala.inline
  def onAfterExpand: onAfterExpand = "onAfterExpand".asInstanceOf[onAfterExpand]
  @scala.inline
  def onAfterFileAdd: onAfterFileAdd = "onAfterFileAdd".asInstanceOf[onAfterFileAdd]
  @scala.inline
  def onAfterFileUpload: onAfterFileUpload = "onAfterFileUpload".asInstanceOf[onAfterFileUpload]
  @scala.inline
  def onAfterFilter: onAfterFilter = "onAfterFilter".asInstanceOf[onAfterFilter]
  @scala.inline
  def onAfterHideTree: onAfterHideTree = "onAfterHideTree".asInstanceOf[onAfterHideTree]
  @scala.inline
  def onAfterLevelDown: onAfterLevelDown = "onAfterLevelDown".asInstanceOf[onAfterLevelDown]
  @scala.inline
  def onAfterLevelUp: onAfterLevelUp = "onAfterLevelUp".asInstanceOf[onAfterLevelUp]
  @scala.inline
  def onAfterLoad: onAfterLoad = "onAfterLoad".asInstanceOf[onAfterLoad]
  @scala.inline
  def onAfterMarkCopy: onAfterMarkCopy = "onAfterMarkCopy".asInstanceOf[onAfterMarkCopy]
  @scala.inline
  def onAfterMarkCut: onAfterMarkCut = "onAfterMarkCut".asInstanceOf[onAfterMarkCut]
  @scala.inline
  def onAfterMenu: onAfterMenu = "onAfterMenu".asInstanceOf[onAfterMenu]
  @scala.inline
  def onAfterModeChange: onAfterModeChange = "onAfterModeChange".asInstanceOf[onAfterModeChange]
  @scala.inline
  def onAfterMonthChange: onAfterMonthChange = "onAfterMonthChange".asInstanceOf[onAfterMonthChange]
  @scala.inline
  def onAfterOpen: onAfterOpen = "onAfterOpen".asInstanceOf[onAfterOpen]
  @scala.inline
  def onAfterPageChange: onAfterPageChange = "onAfterPageChange".asInstanceOf[onAfterPageChange]
  @scala.inline
  def onAfterPasteFile: onAfterPasteFile = "onAfterPasteFile".asInstanceOf[onAfterPasteFile]
  @scala.inline
  def onAfterPathClick: onAfterPathClick = "onAfterPathClick".asInstanceOf[onAfterPathClick]
  @scala.inline
  def onAfterPortletMove: onAfterPortletMove = "onAfterPortletMove".asInstanceOf[onAfterPortletMove]
  @scala.inline
  def onAfterRangeChange: onAfterRangeChange = "onAfterRangeChange".asInstanceOf[onAfterRangeChange]
  @scala.inline
  def onAfterRender: onAfterRender = "onAfterRender".asInstanceOf[onAfterRender]
  @scala.inline
  def onAfterRun: onAfterRun = "onAfterRun".asInstanceOf[onAfterRun]
  @scala.inline
  def onAfterScroll: onAfterScroll = "onAfterScroll".asInstanceOf[onAfterScroll]
  @scala.inline
  def onAfterSearch: onAfterSearch = "onAfterSearch".asInstanceOf[onAfterSearch]
  @scala.inline
  def onAfterSelect: onAfterSelect = "onAfterSelect".asInstanceOf[onAfterSelect]
  @scala.inline
  def onAfterSheetShow: onAfterSheetShow = "onAfterSheetShow".asInstanceOf[onAfterSheetShow]
  @scala.inline
  def onAfterShowTree: onAfterShowTree = "onAfterShowTree".asInstanceOf[onAfterShowTree]
  @scala.inline
  def onAfterSort: onAfterSort = "onAfterSort".asInstanceOf[onAfterSort]
  @scala.inline
  def onAfterStart: onAfterStart = "onAfterStart".asInstanceOf[onAfterStart]
  @scala.inline
  def onAfterStatusChange: onAfterStatusChange = "onAfterStatusChange".asInstanceOf[onAfterStatusChange]
  @scala.inline
  def onAfterTabClick: onAfterTabClick = "onAfterTabClick".asInstanceOf[onAfterTabClick]
  @scala.inline
  def onAfterUnSelect: onAfterUnSelect = "onAfterUnSelect".asInstanceOf[onAfterUnSelect]
  @scala.inline
  def onAfterUploadDialog: onAfterUploadDialog = "onAfterUploadDialog".asInstanceOf[onAfterUploadDialog]
  @scala.inline
  def onAfterValidation: onAfterValidation = "onAfterValidation".asInstanceOf[onAfterValidation]
  @scala.inline
  def onAfterZoom: onAfterZoom = "onAfterZoom".asInstanceOf[onAfterZoom]
  @scala.inline
  def onApply: onApply = "onApply".asInstanceOf[onApply]
  @scala.inline
  def onAreaDrag: onAreaDrag = "onAreaDrag".asInstanceOf[onAreaDrag]
  @scala.inline
  def onAvatarClick: onAvatarClick = "onAvatarClick".asInstanceOf[onAvatarClick]
  @scala.inline
  def onBeforeAdd: onBeforeAdd = "onBeforeAdd".asInstanceOf[onBeforeAdd]
  @scala.inline
  def onBeforeApply: onBeforeApply = "onBeforeApply".asInstanceOf[onBeforeApply]
  @scala.inline
  def onBeforeAreaAdd: onBeforeAreaAdd = "onBeforeAreaAdd".asInstanceOf[onBeforeAreaAdd]
  @scala.inline
  def onBeforeAreaRemove: onBeforeAreaRemove = "onBeforeAreaRemove".asInstanceOf[onBeforeAreaRemove]
  @scala.inline
  def onBeforeBack: onBeforeBack = "onBeforeBack".asInstanceOf[onBeforeBack]
  @scala.inline
  def onBeforeBlockSelect: onBeforeBlockSelect = "onBeforeBlockSelect".asInstanceOf[onBeforeBlockSelect]
  @scala.inline
  def onBeforeCancel: onBeforeCancel = "onBeforeCancel".asInstanceOf[onBeforeCancel]
  @scala.inline
  def onBeforeClose: onBeforeClose = "onBeforeClose".asInstanceOf[onBeforeClose]
  @scala.inline
  def onBeforeColumnDrag: onBeforeColumnDrag = "onBeforeColumnDrag".asInstanceOf[onBeforeColumnDrag]
  @scala.inline
  def onBeforeColumnDrop: onBeforeColumnDrop = "onBeforeColumnDrop".asInstanceOf[onBeforeColumnDrop]
  @scala.inline
  def onBeforeColumnDropOrder: onBeforeColumnDropOrder = "onBeforeColumnDropOrder".asInstanceOf[onBeforeColumnDropOrder]
  @scala.inline
  def onBeforeColumnHide: onBeforeColumnHide = "onBeforeColumnHide".asInstanceOf[onBeforeColumnHide]
  @scala.inline
  def onBeforeColumnShow: onBeforeColumnShow = "onBeforeColumnShow".asInstanceOf[onBeforeColumnShow]
  @scala.inline
  def onBeforeContextMenu: onBeforeContextMenu = "onBeforeContextMenu".asInstanceOf[onBeforeContextMenu]
  @scala.inline
  def onBeforeCreateFolder: onBeforeCreateFolder = "onBeforeCreateFolder".asInstanceOf[onBeforeCreateFolder]
  @scala.inline
  def onBeforeCursorChange: onBeforeCursorChange = "onBeforeCursorChange".asInstanceOf[onBeforeCursorChange]
  @scala.inline
  def onBeforeDateSelect: onBeforeDateSelect = "onBeforeDateSelect".asInstanceOf[onBeforeDateSelect]
  @scala.inline
  def onBeforeDelete: onBeforeDelete = "onBeforeDelete".asInstanceOf[onBeforeDelete]
  @scala.inline
  def onBeforeDeleteFile: onBeforeDeleteFile = "onBeforeDeleteFile".asInstanceOf[onBeforeDeleteFile]
  @scala.inline
  def onBeforeDrag: onBeforeDrag = "onBeforeDrag".asInstanceOf[onBeforeDrag]
  @scala.inline
  def onBeforeDragIn: onBeforeDragIn = "onBeforeDragIn".asInstanceOf[onBeforeDragIn]
  @scala.inline
  def onBeforeDrop: onBeforeDrop = "onBeforeDrop".asInstanceOf[onBeforeDrop]
  @scala.inline
  def onBeforeDropOrder: onBeforeDropOrder = "onBeforeDropOrder".asInstanceOf[onBeforeDropOrder]
  @scala.inline
  def onBeforeDropOut: onBeforeDropOut = "onBeforeDropOut".asInstanceOf[onBeforeDropOut]
  @scala.inline
  def onBeforeDynLoad: onBeforeDynLoad = "onBeforeDynLoad".asInstanceOf[onBeforeDynLoad]
  @scala.inline
  def onBeforeDynParse: onBeforeDynParse = "onBeforeDynParse".asInstanceOf[onBeforeDynParse]
  @scala.inline
  def onBeforeEditFile: onBeforeEditFile = "onBeforeEditFile".asInstanceOf[onBeforeEditFile]
  @scala.inline
  def onBeforeEditStart: onBeforeEditStart = "onBeforeEditStart".asInstanceOf[onBeforeEditStart]
  @scala.inline
  def onBeforeEditStop: onBeforeEditStop = "onBeforeEditStop".asInstanceOf[onBeforeEditStop]
  @scala.inline
  def onBeforeFileAdd: onBeforeFileAdd = "onBeforeFileAdd".asInstanceOf[onBeforeFileAdd]
  @scala.inline
  def onBeforeFileUpload: onBeforeFileUpload = "onBeforeFileUpload".asInstanceOf[onBeforeFileUpload]
  @scala.inline
  def onBeforeFilter: onBeforeFilter = "onBeforeFilter".asInstanceOf[onBeforeFilter]
  @scala.inline
  def onBeforeHideTree: onBeforeHideTree = "onBeforeHideTree".asInstanceOf[onBeforeHideTree]
  @scala.inline
  def onBeforeLevelDown: onBeforeLevelDown = "onBeforeLevelDown".asInstanceOf[onBeforeLevelDown]
  @scala.inline
  def onBeforeLevelUp: onBeforeLevelUp = "onBeforeLevelUp".asInstanceOf[onBeforeLevelUp]
  @scala.inline
  def onBeforeLoad: onBeforeLoad = "onBeforeLoad".asInstanceOf[onBeforeLoad]
  @scala.inline
  def onBeforeMarkCopy: onBeforeMarkCopy = "onBeforeMarkCopy".asInstanceOf[onBeforeMarkCopy]
  @scala.inline
  def onBeforeMarkCut: onBeforeMarkCut = "onBeforeMarkCut".asInstanceOf[onBeforeMarkCut]
  @scala.inline
  def onBeforeMenu: onBeforeMenu = "onBeforeMenu".asInstanceOf[onBeforeMenu]
  @scala.inline
  def onBeforeModeChange: onBeforeModeChange = "onBeforeModeChange".asInstanceOf[onBeforeModeChange]
  @scala.inline
  def onBeforeMonthChange: onBeforeMonthChange = "onBeforeMonthChange".asInstanceOf[onBeforeMonthChange]
  @scala.inline
  def onBeforeOpen: onBeforeOpen = "onBeforeOpen".asInstanceOf[onBeforeOpen]
  @scala.inline
  def onBeforePageChange: onBeforePageChange = "onBeforePageChange".asInstanceOf[onBeforePageChange]
  @scala.inline
  def onBeforePasteFile: onBeforePasteFile = "onBeforePasteFile".asInstanceOf[onBeforePasteFile]
  @scala.inline
  def onBeforePortletMove: onBeforePortletMove = "onBeforePortletMove".asInstanceOf[onBeforePortletMove]
  @scala.inline
  def onBeforeRender: onBeforeRender = "onBeforeRender".asInstanceOf[onBeforeRender]
  @scala.inline
  def onBeforeRequest: onBeforeRequest = "onBeforeRequest".asInstanceOf[onBeforeRequest]
  @scala.inline
  def onBeforeRun: onBeforeRun = "onBeforeRun".asInstanceOf[onBeforeRun]
  @scala.inline
  def onBeforeSearch: onBeforeSearch = "onBeforeSearch".asInstanceOf[onBeforeSearch]
  @scala.inline
  def onBeforeSearchRequest: onBeforeSearchRequest = "onBeforeSearchRequest".asInstanceOf[onBeforeSearchRequest]
  @scala.inline
  def onBeforeSelect: onBeforeSelect = "onBeforeSelect".asInstanceOf[onBeforeSelect]
  @scala.inline
  def onBeforeSheetShow: onBeforeSheetShow = "onBeforeSheetShow".asInstanceOf[onBeforeSheetShow]
  @scala.inline
  def onBeforeShow: onBeforeShow = "onBeforeShow".asInstanceOf[onBeforeShow]
  @scala.inline
  def onBeforeShowTree: onBeforeShowTree = "onBeforeShowTree".asInstanceOf[onBeforeShowTree]
  @scala.inline
  def onBeforeSort: onBeforeSort = "onBeforeSort".asInstanceOf[onBeforeSort]
  @scala.inline
  def onBeforeSpan: onBeforeSpan = "onBeforeSpan".asInstanceOf[onBeforeSpan]
  @scala.inline
  def onBeforeSplit: onBeforeSplit = "onBeforeSplit".asInstanceOf[onBeforeSplit]
  @scala.inline
  def onBeforeStart: onBeforeStart = "onBeforeStart".asInstanceOf[onBeforeStart]
  @scala.inline
  def onBeforeStatusChange: onBeforeStatusChange = "onBeforeStatusChange".asInstanceOf[onBeforeStatusChange]
  @scala.inline
  def onBeforeTabClick: onBeforeTabClick = "onBeforeTabClick".asInstanceOf[onBeforeTabClick]
  @scala.inline
  def onBeforeTabClose: onBeforeTabClose = "onBeforeTabClose".asInstanceOf[onBeforeTabClose]
  @scala.inline
  def onBeforeUnSelect: onBeforeUnSelect = "onBeforeUnSelect".asInstanceOf[onBeforeUnSelect]
  @scala.inline
  def onBeforeUploadDialog: onBeforeUploadDialog = "onBeforeUploadDialog".asInstanceOf[onBeforeUploadDialog]
  @scala.inline
  def onBeforeValidate: onBeforeValidate = "onBeforeValidate".asInstanceOf[onBeforeValidate]
  @scala.inline
  def onBeforeValueChange: onBeforeValueChange = "onBeforeValueChange".asInstanceOf[onBeforeValueChange]
  @scala.inline
  def onBeforeZoom: onBeforeZoom = "onBeforeZoom".asInstanceOf[onBeforeZoom]
  @scala.inline
  def onBindRequest: onBindRequest = "onBindRequest".asInstanceOf[onBindRequest]
  @scala.inline
  def onBindUpdate: onBindUpdate = "onBindUpdate".asInstanceOf[onBindUpdate]
  @scala.inline
  def onBlur: onBlur = "onBlur".asInstanceOf[onBlur]
  @scala.inline
  def onCancel: onCancel = "onCancel".asInstanceOf[onCancel]
  @scala.inline
  def onCellChange: onCellChange = "onCellChange".asInstanceOf[onCellChange]
  @scala.inline
  def onChange: onChange = "onChange".asInstanceOf[onChange]
  @scala.inline
  def onCheck: onCheck = "onCheck".asInstanceOf[onCheck]
  @scala.inline
  def onCollectValues: onCollectValues = "onCollectValues".asInstanceOf[onCollectValues]
  @scala.inline
  def onColumnResize: onColumnResize = "onColumnResize".asInstanceOf[onColumnResize]
  @scala.inline
  def onComponentInit: onComponentInit = "onComponentInit".asInstanceOf[onComponentInit]
  @scala.inline
  def onCopyError: onCopyError = "onCopyError".asInstanceOf[onCopyError]
  @scala.inline
  def onDataParse: onDataParse = "onDataParse".asInstanceOf[onDataParse]
  @scala.inline
  def onDataRequest: onDataRequest = "onDataRequest".asInstanceOf[onDataRequest]
  @scala.inline
  def onDataSerialize: onDataSerialize = "onDataSerialize".asInstanceOf[onDataSerialize]
  @scala.inline
  def onDataUpdate: onDataUpdate = "onDataUpdate".asInstanceOf[onDataUpdate]
  @scala.inline
  def onDateClear: onDateClear = "onDateClear".asInstanceOf[onDateClear]
  @scala.inline
  def onDateSelect: onDateSelect = "onDateSelect".asInstanceOf[onDateSelect]
  @scala.inline
  def onDestruct: onDestruct = "onDestruct".asInstanceOf[onDestruct]
  @scala.inline
  def onDocumentReady: onDocumentReady = "onDocumentReady".asInstanceOf[onDocumentReady]
  @scala.inline
  def onDragOut: onDragOut = "onDragOut".asInstanceOf[onDragOut]
  @scala.inline
  def onDynLoadError: onDynLoadError = "onDynLoadError".asInstanceOf[onDynLoadError]
  @scala.inline
  def onEditorChange: onEditorChange = "onEditorChange".asInstanceOf[onEditorChange]
  @scala.inline
  def onEnd: onEnd = "onEnd".asInstanceOf[onEnd]
  @scala.inline
  def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  @scala.inline
  def onErrorResponse: onErrorResponse = "onErrorResponse".asInstanceOf[onErrorResponse]
  @scala.inline
  def onFileUpload: onFileUpload = "onFileUpload".asInstanceOf[onFileUpload]
  @scala.inline
  def onFileUploadError: onFileUploadError = "onFileUploadError".asInstanceOf[onFileUploadError]
  @scala.inline
  def onFilterChange: onFilterChange = "onFilterChange".asInstanceOf[onFilterChange]
  @scala.inline
  def onFilterCreate: onFilterCreate = "onFilterCreate".asInstanceOf[onFilterCreate]
  @scala.inline
  def onFocus: onFocus = "onFocus".asInstanceOf[onFocus]
  @scala.inline
  def onFolderSelect: onFolderSelect = "onFolderSelect".asInstanceOf[onFolderSelect]
  @scala.inline
  def onHeaderClick: onHeaderClick = "onHeaderClick".asInstanceOf[onHeaderClick]
  @scala.inline
  def onHeaderInit: onHeaderInit = "onHeaderInit".asInstanceOf[onHeaderInit]
  @scala.inline
  def onHeatMapRender: onHeatMapRender = "onHeatMapRender".asInstanceOf[onHeatMapRender]
  @scala.inline
  def onHide: onHide = "onHide".asInstanceOf[onHide]
  @scala.inline
  def onHideSearchResults: onHideSearchResults = "onHideSearchResults".asInstanceOf[onHideSearchResults]
  @scala.inline
  def onHistoryChange: onHistoryChange = "onHistoryChange".asInstanceOf[onHistoryChange]
  @scala.inline
  def onItemCheck: onItemCheck = "onItemCheck".asInstanceOf[onItemCheck]
  @scala.inline
  def onItemClick: onItemClick = "onItemClick".asInstanceOf[onItemClick]
  @scala.inline
  def onItemDblClick: onItemDblClick = "onItemDblClick".asInstanceOf[onItemDblClick]
  @scala.inline
  def onItemRename: onItemRename = "onItemRename".asInstanceOf[onItemRename]
  @scala.inline
  def onItemRender: onItemRender = "onItemRender".asInstanceOf[onItemRender]
  @scala.inline
  def onItemSelect: onItemSelect = "onItemSelect".asInstanceOf[onItemSelect]
  @scala.inline
  def onKeyPress: onKeyPress = "onKeyPress".asInstanceOf[onKeyPress]
  @scala.inline
  def onKeySelect: onKeySelect = "onKeySelect".asInstanceOf[onKeySelect]
  @scala.inline
  def onListAfterContextMenu: onListAfterContextMenu = "onListAfterContextMenu".asInstanceOf[onListAfterContextMenu]
  @scala.inline
  def onListAfterDrop: onListAfterDrop = "onListAfterDrop".asInstanceOf[onListAfterDrop]
  @scala.inline
  def onListAfterSelect: onListAfterSelect = "onListAfterSelect".asInstanceOf[onListAfterSelect]
  @scala.inline
  def onListBeforeContextMenu: onListBeforeContextMenu = "onListBeforeContextMenu".asInstanceOf[onListBeforeContextMenu]
  @scala.inline
  def onListBeforeDrag: onListBeforeDrag = "onListBeforeDrag".asInstanceOf[onListBeforeDrag]
  @scala.inline
  def onListBeforeDragIn: onListBeforeDragIn = "onListBeforeDragIn".asInstanceOf[onListBeforeDragIn]
  @scala.inline
  def onListBeforeDrop: onListBeforeDrop = "onListBeforeDrop".asInstanceOf[onListBeforeDrop]
  @scala.inline
  def onListBeforeSelect: onListBeforeSelect = "onListBeforeSelect".asInstanceOf[onListBeforeSelect]
  @scala.inline
  def onListIconClick: onListIconClick = "onListIconClick".asInstanceOf[onListIconClick]
  @scala.inline
  def onListItemClick: onListItemClick = "onListItemClick".asInstanceOf[onListItemClick]
  @scala.inline
  def onListItemDblClick: onListItemDblClick = "onListItemDblClick".asInstanceOf[onListItemDblClick]
  @scala.inline
  def onLiveEdit: onLiveEdit = "onLiveEdit".asInstanceOf[onLiveEdit]
  @scala.inline
  def onLoadError: onLoadError = "onLoadError".asInstanceOf[onLoadError]
  @scala.inline
  def onLongTouch: onLongTouch = "onLongTouch".asInstanceOf[onLongTouch]
  @scala.inline
  def onMapError: onMapError = "onMapError".asInstanceOf[onMapError]
  @scala.inline
  def onMapReady: onMapReady = "onMapReady".asInstanceOf[onMapReady]
  @scala.inline
  def onMathRefresh: onMathRefresh = "onMathRefresh".asInstanceOf[onMathRefresh]
  @scala.inline
  def onMenuItemClick: onMenuItemClick = "onMenuItemClick".asInstanceOf[onMenuItemClick]
  @scala.inline
  def onMouseMove: onMouseMove = "onMouseMove".asInstanceOf[onMouseMove]
  @scala.inline
  def onMouseMoving: onMouseMoving = "onMouseMoving".asInstanceOf[onMouseMoving]
  @scala.inline
  def onMouseOut: onMouseOut = "onMouseOut".asInstanceOf[onMouseOut]
  @scala.inline
  def onMoveError: onMoveError = "onMoveError".asInstanceOf[onMoveError]
  @scala.inline
  def onNext: onNext = "onNext".asInstanceOf[onNext]
  @scala.inline
  def onOptionRemove: onOptionRemove = "onOptionRemove".asInstanceOf[onOptionRemove]
  @scala.inline
  def onPageRender: onPageRender = "onPageRender".asInstanceOf[onPageRender]
  @scala.inline
  def onPartialRender: onPartialRender = "onPartialRender".asInstanceOf[onPartialRender]
  @scala.inline
  def onPaste: onPaste = "onPaste".asInstanceOf[onPaste]
  @scala.inline
  def onPathComplete: onPathComplete = "onPathComplete".asInstanceOf[onPathComplete]
  @scala.inline
  def onPathLevel: onPathLevel = "onPathLevel".asInstanceOf[onPathLevel]
  @scala.inline
  def onPopup: onPopup = "onPopup".asInstanceOf[onPopup]
  @scala.inline
  def onPrevious: onPrevious = "onPrevious".asInstanceOf[onPrevious]
  @scala.inline
  def onRegionClick: onRegionClick = "onRegionClick".asInstanceOf[onRegionClick]
  @scala.inline
  def onReset: onReset = "onReset".asInstanceOf[onReset]
  @scala.inline
  def onResize: onResize = "onResize".asInstanceOf[onResize]
  @scala.inline
  def onResizeEnd: onResizeEnd = "onResizeEnd".asInstanceOf[onResizeEnd]
  @scala.inline
  def onRowResize: onRowResize = "onRowResize".asInstanceOf[onRowResize]
  @scala.inline
  def onScaleChange: onScaleChange = "onScaleChange".asInstanceOf[onScaleChange]
  @scala.inline
  def onScroll: onScroll = "onScroll".asInstanceOf[onScroll]
  @scala.inline
  def onScrollX: onScrollX = "onScrollX".asInstanceOf[onScrollX]
  @scala.inline
  def onScrollY: onScrollY = "onScrollY".asInstanceOf[onScrollY]
  @scala.inline
  def onSearchIconClick: onSearchIconClick = "onSearchIconClick".asInstanceOf[onSearchIconClick]
  @scala.inline
  def onSectionAdd: onSectionAdd = "onSectionAdd".asInstanceOf[onSectionAdd]
  @scala.inline
  def onSectionRemove: onSectionRemove = "onSectionRemove".asInstanceOf[onSectionRemove]
  @scala.inline
  def onSelect: onSelect = "onSelect".asInstanceOf[onSelect]
  @scala.inline
  def onSelectChange: onSelectChange = "onSelectChange".asInstanceOf[onSelectChange]
  @scala.inline
  def onSheetAdd: onSheetAdd = "onSheetAdd".asInstanceOf[onSheetAdd]
  @scala.inline
  def onSheetRemove: onSheetRemove = "onSheetRemove".asInstanceOf[onSheetRemove]
  @scala.inline
  def onSheetRename: onSheetRename = "onSheetRename".asInstanceOf[onSheetRename]
  @scala.inline
  def onShow: onShow = "onShow".asInstanceOf[onShow]
  @scala.inline
  def onShowSearchResults: onShowSearchResults = "onShowSearchResults".asInstanceOf[onShowSearchResults]
  @scala.inline
  def onSkip: onSkip = "onSkip".asInstanceOf[onSkip]
  @scala.inline
  def onSliderDrag: onSliderDrag = "onSliderDrag".asInstanceOf[onSliderDrag]
  @scala.inline
  def onStructureLoad: onStructureLoad = "onStructureLoad".asInstanceOf[onStructureLoad]
  @scala.inline
  def onStructureUpdate: onStructureUpdate = "onStructureUpdate".asInstanceOf[onStructureUpdate]
  @scala.inline
  def onStyleSet: onStyleSet = "onStyleSet".asInstanceOf[onStyleSet]
  @scala.inline
  def onSubViewClose: onSubViewClose = "onSubViewClose".asInstanceOf[onSubViewClose]
  @scala.inline
  def onSubViewCreate: onSubViewCreate = "onSubViewCreate".asInstanceOf[onSubViewCreate]
  @scala.inline
  def onSubViewOpen: onSubViewOpen = "onSubViewOpen".asInstanceOf[onSubViewOpen]
  @scala.inline
  def onSubViewRender: onSubViewRender = "onSubViewRender".asInstanceOf[onSubViewRender]
  @scala.inline
  def onSubmit: onSubmit = "onSubmit".asInstanceOf[onSubmit]
  @scala.inline
  def onSuccessResponse: onSuccessResponse = "onSuccessResponse".asInstanceOf[onSuccessResponse]
  @scala.inline
  def onSwipeX: onSwipeX = "onSwipeX".asInstanceOf[onSwipeX]
  @scala.inline
  def onSwipeY: onSwipeY = "onSwipeY".asInstanceOf[onSwipeY]
  @scala.inline
  def onTimedKeyPress: onTimedKeyPress = "onTimedKeyPress".asInstanceOf[onTimedKeyPress]
  @scala.inline
  def onTodaySet: onTodaySet = "onTodaySet".asInstanceOf[onTodaySet]
  @scala.inline
  def onTouchEnd: onTouchEnd = "onTouchEnd".asInstanceOf[onTouchEnd]
  @scala.inline
  def onTouchMove: onTouchMove = "onTouchMove".asInstanceOf[onTouchMove]
  @scala.inline
  def onTouchStart: onTouchStart = "onTouchStart".asInstanceOf[onTouchStart]
  @scala.inline
  def onUploadComplete: onUploadComplete = "onUploadComplete".asInstanceOf[onUploadComplete]
  @scala.inline
  def onValidationError: onValidationError = "onValidationError".asInstanceOf[onValidationError]
  @scala.inline
  def onValidationSuccess: onValidationSuccess = "onValidationSuccess".asInstanceOf[onValidationSuccess]
  @scala.inline
  def onValueSuggest: onValueSuggest = "onValueSuggest".asInstanceOf[onValueSuggest]
  @scala.inline
  def onValues: onValues = "onValues".asInstanceOf[onValues]
  @scala.inline
  def onViewChange: onViewChange = "onViewChange".asInstanceOf[onViewChange]
  @scala.inline
  def onViewInit: onViewInit = "onViewInit".asInstanceOf[onViewInit]
  @scala.inline
  def onViewMove: onViewMove = "onViewMove".asInstanceOf[onViewMove]
  @scala.inline
  def onViewMoveEnd: onViewMoveEnd = "onViewMoveEnd".asInstanceOf[onViewMoveEnd]
  @scala.inline
  def onViewResize: onViewResize = "onViewResize".asInstanceOf[onViewResize]
  @scala.inline
  def onWebWorkerEnd: onWebWorkerEnd = "onWebWorkerEnd".asInstanceOf[onWebWorkerEnd]
  @scala.inline
  def onWebWorkerStart: onWebWorkerStart = "onWebWorkerStart".asInstanceOf[onWebWorkerStart]
}

